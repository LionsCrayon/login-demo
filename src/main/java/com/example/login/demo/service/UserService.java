package com.example.login.demo.service;

import com.example.login.demo.entity.User;

public interface UserService {
    //业务逻辑
    public User login(String loginid,String loginpwd);
}
