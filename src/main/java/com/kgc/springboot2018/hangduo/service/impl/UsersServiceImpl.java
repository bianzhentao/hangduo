package com.kgc.springboot2018.hangduo.service.impl;

import com.kgc.springboot2018.hangduo.mapper.UsersMapper;
import com.kgc.springboot2018.hangduo.pojo.User;
import com.kgc.springboot2018.hangduo.pojo.Users;
import com.kgc.springboot2018.hangduo.pojo.UsersExample;
import com.kgc.springboot2018.hangduo.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    UsersMapper usersMapper;
    @Override
    public Users selectByExample(String up_phone, String ipPassword) {
        UsersExample example=new UsersExample();
        example.createCriteria().andUpPhoneEqualTo(up_phone).andIpPasswordEqualTo(ipPassword);
        List<Users> users = usersMapper.selectByExample(example);
        return users.get(0);
    }

    @Override
    public int doupdate(Users users) {
        int i = usersMapper.updateByPrimaryKeySelective(users);
        return i;
    }
}
