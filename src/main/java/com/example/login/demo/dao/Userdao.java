package com.example.login.demo.dao;

import com.example.login.demo.entity.User;

/**
 * @Title: 会话层接口
 * @Description: TODO(登录中传入两个值，账号和密码)
 * @param @param
 * @return @return
 * @author Lion
 * @throws
 * @date 2020/3/21 19:55
 */
public interface Userdao  {

    public User login(String loginid,String loginpwd);
}
