package com.kgc.springboot2018.hangduo.controller;

import com.kgc.springboot2018.hangduo.pojo.User;
import com.kgc.springboot2018.hangduo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

@Controller
public class Usercontroller {
    @Resource
    UserService userService;
    @RequestMapping("/a/login")
    public String logina(String userName, String password, String rememberMe, HttpSession session, PrintWriter out, HttpServletResponse response){
        User login = userService.login(userName, password);

        if ("rembera".equals(rememberMe)){
            Cookie cookie=new Cookie("username",userName);
            Cookie cookiea=new Cookie("password",password);
            response.addCookie(cookie);
            response.addCookie(cookiea);
        }
        if (login!=null){
            String realName = login.getRealName();
            session.setAttribute("realName",realName);
            out.print("<script>alert('登录成功')</script>");
            return "aaa";
        }else {
            out.print("<script>alert('登录失败,用户名户密码错误')</script>");
            return "title";
        }


    }

    @RequestMapping("/zhuces")
    public String zhuces(){
        return "zhuce";
    }

    @RequestMapping("/zhuce")
    public String adduser(PrintWriter out,User users){

        int adduser = userService.adduser(users);
        if (adduser>0){
            out.print("<script>alert('注册成功')</script>");
            return "title";
        }else {
            out.print("<script>alert('注册失败,用户名错误')</script>");
            return "zhuce";
        }

    }
    @RequestMapping("/check")
    public void chech(String userName,PrintWriter out){
        System.out.println(userName+"zheli");
        int check = userService.check(userName);
        boolean flag=false;
        if (check>0){
           flag=true;
        }
        System.out.println(flag+"123");
        out.print(flag);
        out.flush();
        out.close();
    }
}
