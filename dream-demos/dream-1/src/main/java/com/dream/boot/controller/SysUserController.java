package com.dream.boot.controller;

import com.dream.boot.api.Message;
import com.dream.boot.domain.SysUserMapper;
import com.dream.boot.domain.SysUserSqlSessionTemplate;
import com.dream.boot.model.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description: 用户信息控制层
 *
 *@author JinJiacheng
 *@date 2019/8/7 22:25
 */
@Slf4j
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysUserSqlSessionTemplate sysUserSqlSessionTemplate;

    /**
     * 查询所有的用户信息
     * @param sysUser 参数
     * @return Message
     */
    @RequestMapping("/list")
    public Message list(@RequestBody SysUser sysUser)
    {
        return Message.data(sysUserMapper.list(sysUser));
    }

    /**
     * 查询所有的用户信息
     * @param sysUser 参数
     * @return Message
     */
    @RequestMapping("/listBySqlSessionTemplate")
    public Message listBySqlSessionTemplate(@RequestBody SysUser sysUser)
    {
        log.info("[/listBySqlSessionTemplate接口参数：]" + sysUser.toString());
        return Message.data(sysUserSqlSessionTemplate.listBySqlSessionTemplate(sysUser));
    }

}
