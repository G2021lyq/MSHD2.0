package com.qiu.Mapper;

import com.qiu.pojo.unified_code_Audio_Relation;
import com.qiu.pojo.unified_code_Audio_RelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface unified_code_Audio_RelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    int countByExample(unified_code_Audio_RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    int deleteByExample(unified_code_Audio_RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    int insert(unified_code_Audio_Relation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    int insertSelective(unified_code_Audio_Relation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    List<unified_code_Audio_Relation> selectByExample(unified_code_Audio_RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    int updateByExampleSelective(@Param("record") unified_code_Audio_Relation record, @Param("example") unified_code_Audio_RelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table unified_code_Audio_Relation
     *
     * @mbggenerated Sat Nov 25 20:04:19 CST 2023
     */
    int updateByExample(@Param("record") unified_code_Audio_Relation record, @Param("example") unified_code_Audio_RelationExample example);
}