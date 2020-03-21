package com.example.login.demo.dao.impl;

import com.example.login.demo.dao.Userdao;
import com.example.login.demo.entity.User;

public class UserDaoImpl implements Userdao {
    public User login(String loginid, String loginpwd) {
        User user = null;

        //判断账号密码
        if ("admin".equals(loginid))
        {
            if ("admin".equals(loginpwd))
            {
                user = new User();
                user.setLoginid("admin");
                user.setLoginpwd("admin");
                user.setName("Lion");
            }
        }
        return user;
    }
}
