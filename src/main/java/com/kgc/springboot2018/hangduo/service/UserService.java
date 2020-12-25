package com.kgc.springboot2018.hangduo.service;

import com.kgc.springboot2018.hangduo.pojo.User;

public interface UserService {
 /*   登录*/
    User login(String userName,String password);
  /*  注册*/
    int adduser(User user);
   /* 验证名字是否存在*/
    int check(String username);
}
