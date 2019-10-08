package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.UserRedis;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: redis用户服务接口
 * @packname: com.example.springbootdemo.service
 * @author: weiziping
 * @create: 2019-10-08 11:01
 */
public interface UserRedisService {

    @Cacheable(value = "users",key = "'user_'+#id")
    UserRedis getUserRedis(String id);

    @CacheEvict(value="users", key="'user_'+#id",condition="#id!=1")
    void deleteUserRedis(String id);
}
