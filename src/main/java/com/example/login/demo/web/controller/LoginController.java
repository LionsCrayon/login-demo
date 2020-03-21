package com.example.login.demo.web.controller;

import com.example.login.demo.entity.User;
import com.example.login.demo.service.Impl.UserServiceImpl;
import com.example.login.demo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version v1.0
 * @ProjectName: login-demo
 * @ClassName: LoginController
 * @Description: TODO(视图控制层)
 * @Author: Lion
 * @Date: 2020/3/21 16:37
 */
public class LoginController extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginid  = req.getParameter("loginid");
        String loginpwd = req.getParameter("loginpwd");

        User user = userService.login(loginid, loginpwd);

        //当用户为空的时候返回的结果
        if (user == null)
        {
            //重定向
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }

        //当账号密码正确后返回的结果
        else
        {
            //重定向
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }
    }
}
