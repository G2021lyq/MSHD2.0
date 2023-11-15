package com.qiu.Rook;
import org.springframework.web.util.UriUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MapGetter {

    public static String URL = "https://api.map.baidu.com/geocoding/v3?";

    //不要改这个,这个是访问Api的key
    public static String AK = "usUYrQ8Az353nDbI6qTU49QL9mLQ9sCd";

    private String Longtitude="0";
    private String Latitude="0";


    public MapData getBaiduMap(String address){
        Map params = new LinkedHashMap<String, String>();
        params.put("address", address);
        params.put("output", "json");
        params.put("ak", AK);
        //params.put("callback", "showLocation");
        try {
            requestGetPos(URL, params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        MapData data=new MapData(this.Longtitude,this.Latitude);
        return data;
    }

    /**
     * 默认ak
     * 选择了ak，使用IP白名单校验：
     * 根据您选择的AK已为您生成调用代码
     * 检测到您当前的ak设置了IP白名单校验
     * 您的IP白名单中的IP非公网IP，请设置为公网IP，否则将请求失败
     * 请在IP地址为的计算发起请求，否则将请求失败
     */
    //
    private void requestGetPos(String strUrl, Map<String, String> param) throws Exception {
        if (strUrl == null || strUrl.length() <= 0 || param == null || param.size() <= 0) {
            return;
        }

        StringBuffer queryString = new StringBuffer();
        queryString.append(strUrl);
        for (Map.Entry<?, ?> pair : param.entrySet()) {
            queryString.append(pair.getKey() + "=");
            //    第一种方式使用的 jdk 自带的转码方式  第二种方式使用的 spring 的转码方法 两种均可
            //    queryString.append(URLEncoder.encode((String) pair.getValue(), "UTF-8").replace("+", "%20") + "&");
            queryString.append(UriUtils.encode((String) pair.getValue(), "UTF-8") + "&");
        }

        if (queryString.length() > 0) {
            queryString.deleteCharAt(queryString.length() - 1);
        }

        java.net.URL url = new URL(queryString.toString());
        System.out.println(queryString.toString());
        URLConnection httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.connect();

        InputStreamReader isr = new InputStreamReader(httpConnection.getInputStream());
        BufferedReader reader = new BufferedReader(isr);
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.toString());
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        reader.close();
        isr.close();
        System.out.println(buffer.toString());




        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse(buffer.toString());

        // 检查是否是JsonObject
        if (jsonElement.isJsonObject()) {
            // 将JsonElement转换为JsonObject
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            // 获取特定键的值
            String lng = jsonObject.get("result").getAsJsonObject().get("location").getAsJsonObject().get("lng").getAsString();
            String lat = jsonObject.get("result").getAsJsonObject().get("location").getAsJsonObject().get("lat").getAsString();
            this.Latitude=lat;
            this.Longtitude=lng;
        } else {
            System.out.println("JSON数据不是一个对象。");
        }
    }
}