package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: 数据映射
 * @packname: com.example.springbootdemo.mapper
 * @author: weiziping
 * @create: 2019-09-08:51
 */
@Mapper
public interface UserMapper {
    List<User> findAll();

    void addUser(User user);
}
