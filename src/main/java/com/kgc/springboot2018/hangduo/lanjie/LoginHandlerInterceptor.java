package com.kgc.springboot2018.hangduo.lanjie;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession();
        Object username = session.getAttribute("userName1");
        System.out.println(username);
        if (username==null){
            request.setAttribute("msg","对不起，请先登录！");
            request.getRequestDispatcher("/title.html").forward(request,response);
            return false;
        }else {
            return true;
        }

    }
}
