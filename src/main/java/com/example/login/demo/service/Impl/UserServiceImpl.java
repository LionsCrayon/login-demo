package com.example.login.demo.service.Impl;

import com.example.login.demo.dao.Userdao;
import com.example.login.demo.dao.impl.UserDaoImpl;
import com.example.login.demo.entity.User;
import com.example.login.demo.service.UserService;

public class UserServiceImpl implements UserService {

    private Userdao userdao = new UserDaoImpl();

    public User login(String loginid, String loginpwd) {
        return userdao.login(loginid, loginpwd);
    }
}
