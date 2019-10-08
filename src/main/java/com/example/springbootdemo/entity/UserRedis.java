package com.example.springbootdemo.entity;

import java.io.Serializable;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: redis使用的用户
 * @packname: com.example.springbootdemo.entity
 * @author: wzp
 * @create: 2019-10-08 10:55
 */
public class UserRedis implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private int age;

    public UserRedis() {
        super();
    }

    public UserRedis(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
