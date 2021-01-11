package com.kgc.springboot2018.hangduo.service;

import com.kgc.springboot2018.hangduo.pojo.Users;

import java.util.List;

public interface UsersService {
    Users selectByExample(String up_phone, String ipPassword);
    int doupdate(Users users);
}
