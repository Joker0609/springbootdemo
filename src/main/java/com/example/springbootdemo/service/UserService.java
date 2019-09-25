package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.User;

import java.util.List;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: 用户业务服务层
 * @packname: com.example.springbootdemo.service
 * @author: weiziping
 * @create: 2019-09-25 08:59
 */
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 加入用户
     * @param user
     */
    void addUser(User user);
}
