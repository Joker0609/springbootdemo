package com.example.springbootdemo.entity;

/**
 * @version 0.0.1
 * @program: springbootdemo
 * @description: 用户信息
 * @packname: com.example.springbootdemo.entity
 * @author: weiziping
 * @create: 2019-09-24 17:55
 */
public class User {
    private Long id;
    private String username;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
