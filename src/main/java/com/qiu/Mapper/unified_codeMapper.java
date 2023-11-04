package com.qiu.Mapper;

import com.qiu.pojo.unified_code;
import com.qiu.pojo.unified_codeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface unified_codeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int countByExample(unified_codeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int deleteByExample(unified_codeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int deleteByPrimaryKey(Integer codingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int insert(unified_code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int insertSelective(unified_code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    List<unified_code> selectByExample(unified_codeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    unified_code selectByPrimaryKey(Integer codingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int updateByExampleSelective(@Param("record") unified_code record, @Param("example") unified_codeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int updateByExample(@Param("record") unified_code record, @Param("example") unified_codeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int updateByPrimaryKeySelective(unified_code record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code
     *
     * @mbggenerated Sat Nov 04 10:17:33 CST 2023
     */
    int updateByPrimaryKey(unified_code record);
}