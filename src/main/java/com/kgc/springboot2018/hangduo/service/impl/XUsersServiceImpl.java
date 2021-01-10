package com.kgc.springboot2018.hangduo.service.impl;

import com.kgc.springboot2018.hangduo.mapper.UserMapper;
import com.kgc.springboot2018.hangduo.mapper.UsersMapper;
import com.kgc.springboot2018.hangduo.pojo.User;
import com.kgc.springboot2018.hangduo.pojo.UserExample;
import com.kgc.springboot2018.hangduo.pojo.Users;
import com.kgc.springboot2018.hangduo.pojo.UsersExample;
import com.kgc.springboot2018.hangduo.service.XUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class XUsersServiceImpl implements XUsersService {
    @Resource
    UsersMapper usersMapper;

    @Override
    public Users getByPhone(String telephone) {
        UsersExample example=new UsersExample();
        if(telephone!=null){
            example.createCriteria().andUpPhoneEqualTo(telephone);
        }
        List <Users> listusers = usersMapper.selectByExample(example);
        if(listusers!=null&&listusers.size()>0){
            return listusers.get(0);
        }
        return null;
    }

    @Override
    public int updatepwdByPho(String upPhone,String psaaword) {
        UsersExample example=new UsersExample();
        if(upPhone!=null){
            example.createCriteria().andUpPhoneEqualTo(upPhone);
        }
        Users users=new Users();
        users.setIpPassword(psaaword);
        int i = usersMapper.updateByExampleSelective(users, example);
        return i;
    }
}
