package com.kgc.springboot2018.hangduo.service.impl;

import com.kgc.springboot2018.hangduo.mapper.UserMapper;
import com.kgc.springboot2018.hangduo.pojo.User;
import com.kgc.springboot2018.hangduo.pojo.UserExample;
import com.kgc.springboot2018.hangduo.service.UserService;
import org.springframework.stereotype.Service;


import com.kgc.springboot2018.hangduo.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;
    @Override
    public User login(String userName, String password) {
        UserExample example=new UserExample();
        example.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(example);
        for (User user : users) {
            System.out.println(user);
            return user;

        }
        return null;
    }

    @Override
    public int adduser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int check(String username) {
        UserExample example=new UserExample();
        example.createCriteria().andUserNameEqualTo(username);
        int i = userMapper.countByExample(example);
        System.out.println(i+"数量");
        return i;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
