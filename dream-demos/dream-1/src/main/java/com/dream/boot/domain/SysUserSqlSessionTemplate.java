package com.dream.boot.domain;

import com.dream.boot.api.BaseMapper;
import com.dream.boot.model.SysUser;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: 集成JdbcTemplate查询数据
 *
 *@author JinJiacheng
 *@date 2019/8/7 23:05
 */
@Component(value = "sysUserSqlSessionTemplate")
public class SysUserSqlSessionTemplate extends BaseMapper {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 查询用户列表
     * @param sysUser 参数
     * @return List<SysUser>
     */
    public List<SysUser> listBySqlSessionTemplate(SysUser sysUser) {
        return sqlSessionTemplate.selectList(getStatementName("list"),sysUser);
    }
}
