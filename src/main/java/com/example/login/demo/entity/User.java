package com.example.login.demo.entity;

import java.io.Serializable;

/**
 * @Title: 用户实体类
 * @Description: TODO(字键生成get和set方法)
 * @param @param
 * @return @return
 * @author Lion
 * @throws
 * @date 2020/3/21 19:57
 */
public class User implements Serializable {
    private String name;
    private String loginid;
    private String loginpwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", loginid='" + loginid + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                '}';
    }
}
