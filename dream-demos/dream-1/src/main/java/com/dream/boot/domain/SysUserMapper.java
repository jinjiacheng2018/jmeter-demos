package com.dream.boot.domain;

import com.dream.boot.api.BaseMapper;
import com.dream.boot.model.SysUser;

import java.util.List;

/**
 * Description: 系统用户持久层
 *
 *@author JinJiacheng
 *@date 2019/8/7 22:16
 */
public interface SysUserMapper {

    int insert(SysUser sysUser);

    int update(SysUser sysUser);

    int delete(SysUser sysUser);

    SysUser uniqueResult(SysUser sysUser);

    List<SysUser> list(SysUser sysUser);

    int count(SysUser sysUser);

}
