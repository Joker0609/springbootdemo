package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: 服务实现层
 * @packname: com.example.springbootdemo.service.impl
 * @author: weiziping
 * @create: 2019-09-25 09:05
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
