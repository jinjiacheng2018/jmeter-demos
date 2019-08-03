package com.jmeter.boot.mapper;

import com.jmeter.boot.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {

    /**
     * 查询所有的用户
     * @return List<User>
     */
    List<User> findAll();

    /**
     * 根据用户id查询用户信息
     * @param user user对象
     * @return User
     */
    User findById(User user);

    /**
     * 根据用户对象创建用户
     * @param user user对象
     * @return User
     */
    int create(User user);

    /**
     * 根据用户id删除用户
     * @param user user对象
     * @return User
     */
    int delete(User user);

    /**
     * 根据用户id更新用户
     * @param user user对象
     * @return User
     */
    int update(User user);

    /**
     * 根据用户姓名查询用户
     * @param user user对象
     * @return User
     */
    List<User> findByName(User user);
}
