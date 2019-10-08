package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.UserRedis;
import com.example.springbootdemo.service.UserRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: 使用redis
 * @packname: com.example.springbootdemo.controller
 * @author: wzp
 * @create: 2019-10-08 09:57
 */
@RestController
public class RedisTestController {
    @Autowired
    private StringRedisTemplate template;

    @RequestMapping(value = "/setValue")
    public String setValue(){
        if (!template.hasKey("joker")){
            template.opsForValue().append("joker","小丑");
            return "使用redis缓存数据成功";
        }else {
            template.delete("joker");
            return "key已存在";
        }
    }

    @RequestMapping(value = "/getValue")
    public String getValue(){
        if(!template.hasKey("joker")){
            return "key不存在,请先保存key";
        }else {
            String joker = template.opsForValue().get("joker");
            return "获取到的值是:joker = " + joker;
        }
    }

    @Autowired
    private UserRedisService userRedisService;
    @RequestMapping("/getUser")
    public UserRedis getUser(){
        UserRedis user = userRedisService.getUserRedis("JOKER");
        return user;
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(){
        userRedisService.deleteUserRedis("JOKER");
        return "执行了删除";
    }
}
