package com.kgc.springboot2018.hangduo.service;


import com.kgc.springboot2018.hangduo.pojo.Users;

public interface XUsersService {
    //根据手机号查询手机号存在不
    Users getByPhone(String upPhone);

    //根据手机号修改密码
    int updatepwdByPho(String upPhone,String psaaword);
}
