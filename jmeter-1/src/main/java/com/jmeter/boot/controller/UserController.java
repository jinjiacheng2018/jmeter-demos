package com.jmeter.boot.controller;

import com.alibaba.fastjson.JSONObject;
import com.jmeter.boot.mapper.UserMapper;
import com.jmeter.boot.model.User;
import com.jmeter.boot.util.Util;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    /**
     * 查询所有的用户信息
     * @return JSONObject
     */
    @RequestMapping("/findAll")
    public JSONObject findAll()
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("allUsers",userMapper.findAll());
        return jsonObject;
    }

    /**
     * 通过ID查询用户信息
     * @param user 参数
     * @return JSONObject
     */
    @RequestMapping("/findById")
    public JSONObject findById(@RequestBody User user)
    {
        Util.assertNotEmpty("用户ID不能为空！！！",user , user.getUserId());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user",userMapper.findById(user));
        return jsonObject;
    }

    /**
     * 创建用户
     * @param user 参数
     * @return JSONObject
     */
    @RequestMapping("/create")
    public JSONObject create(@RequestBody User user)
    {
        Util.assertNotEmpty("参数错误！！！",user);
        JSONObject jsonObject = new JSONObject();
        // 插入数据
        userMapper.create(user);
        jsonObject.put("user",user);
        return jsonObject;
    }

    /**
     * 根据用户ID删除用户信息
     * @param user 参数
     * @return JSONObject
     */
    @RequestMapping("/delete")
    public JSONObject delete(@RequestBody User user)
    {
        Util.assertNotEmpty("用户ID不能为空！！！",user , user.getUserId());
        JSONObject jsonObject = new JSONObject();
        User userMapperById = userMapper.findById(user);
        jsonObject.put("deleteUser",userMapperById);
        userMapper.delete(user);
        return jsonObject;
    }

    /**
     * 更新用户信息
     * @param user 参数
     * @return JSONObject
     */
    @RequestMapping("/update")
    public JSONObject update(@RequestBody User user)
    {
        Util.assertNotEmpty("用户ID不能为空！！！",user , user.getUserId());
        JSONObject jsonObject = new JSONObject();
        userMapper.update(user);
        jsonObject.put("updateUser",userMapper.findById(user));
        return jsonObject;
    }

    /**
     * 根据用户名查询用户信息
     * @param user 参数
     * @return JSONObject
     */
    @RequestMapping("/findByName")
    public JSONObject findByName(@RequestBody User user)
    {
        Util.assertNotEmpty("用户姓名不能为空！！！", user, user.getUserName());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user",userMapper.findByName(user));
        return jsonObject;
    }
}
