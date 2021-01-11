package com.kgc.springboot2018.hangduo.controller;

import com.kgc.springboot2018.hangduo.pojo.Users;
import com.kgc.springboot2018.hangduo.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class UsersController {
    @Resource
    UsersService usersService;

    @RequestMapping("/WebLogin")
    public String webLogin(){
        return "WebLogin";
    }

    @RequestMapping("/tologin")
    public String WebLogin(String phone, String password, HttpSession session, PrintWriter out){
        Users users = usersService.selectByExample(phone, password);
        if (users!=null){
            session.setAttribute("users",users);
            out.print("<script>alert('登录成功')</script>");
            return "redirect:/zhuyee";
        }else {
            out.print("<script>alert('登录失败,用户名户密码错误')</script>");
            return "WebLogin";
        }
    }
    @RequestMapping("/WebUpdate")
    public String WebUpdate(){
        return "Webzhuce";
    }
    @RequestMapping("/WebToUpdate")
    public String WebToUpdate(String upName,String upPhone,String ipPassword,String upSex,PrintWriter out){
        Users users=new Users();
        users.setUpName(upName);
        users.setUpSex(Integer.parseInt(upSex));
        users.setIpPassword(ipPassword);
        users.setUpPhone(upPhone);
        users.setUpViptype(0);
        int doupdate = usersService.doupdate(users);
        if (doupdate>0){
            out.print("<script>alert('注册成功')</script>");
            return "";
        }else {
            out.print("<script>alert('注册成功')</script>");
            return "";
        }
    }
}
