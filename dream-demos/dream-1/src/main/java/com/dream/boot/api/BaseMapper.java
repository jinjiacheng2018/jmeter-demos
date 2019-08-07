package com.dream.boot.api;

/**
 * Description: 集成JdbcTemplate查询数据的集成Mapper
 *
 *@author JinJiacheng
 *@date 2019/8/7 22:56
 */
public class BaseMapper {

    /**
     * 获取当前类的class对象的name
     * @return String
     */
    private String getNameSpace()
    {
        return this.getClass().getName();
    }

    /**
     * 获取查询的SQLID名称
     * @param sqlId
     * @return
     */
    public String getStatementName(String sqlId)
    {
        return getNameSpace() + "." + sqlId;
    }

}
