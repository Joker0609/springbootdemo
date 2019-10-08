package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.UserRedis;
import com.example.springbootdemo.service.UserRedisService;
import org.springframework.stereotype.Service;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description:
 * @packname: com.example.springbootdemo.service.impl
 * @author: wzp
 * @create: 2019-10-08 11:03
 */
@Service
public class UserRedisServiceImpl implements UserRedisService {

    @Override
    public UserRedis getUserRedis(String id) {
        System.out.println(id+"进入实现类获取数据！");
        UserRedis user = new UserRedis();
        user.setId(id);
        user.setName("香菇");
        user.setAge(18);
        return user;

    }

    @Override
    public void deleteUserRedis(String id) {
        System.out.println(id+"进入实现类删除数据！");
    }

}
