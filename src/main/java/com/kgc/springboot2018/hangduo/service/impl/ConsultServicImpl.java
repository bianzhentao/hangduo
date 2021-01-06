package com.kgc.springboot2018.hangduo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.springboot2018.hangduo.mapper.ConsultMapper;
import com.kgc.springboot2018.hangduo.pojo.Consult;
import com.kgc.springboot2018.hangduo.pojo.ConsultExample;
import com.kgc.springboot2018.hangduo.service.ConsultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsultServicImpl implements ConsultService {
    @Resource
    ConsultMapper consultMapper;

    @Override
    public PageInfo<Consult> getListx(Integer PageNum, Integer pageSize, String typesel) {
        PageHelper.startPage(PageNum,pageSize);
        ConsultExample example=new ConsultExample();
        ConsultExample.Criteria criteria = example.createCriteria();
        ConsultExample.Criteria criteria2 = example.createCriteria();
        if(typesel!=null&&typesel!=""){
            //System.out.println("电话");
            criteria.andZphoneLike("%"+typesel+"%");
        }
        if(typesel!=null&&typesel!=""){
            //System.out.println("内容");
            criteria2.andZcontentLike("%"+typesel+"%");
        }
        example.or(criteria2);
        List <Consult> consults = consultMapper.selectByExample(example);
        PageInfo<Consult>pageInfo=new PageInfo <>(consults);
        return pageInfo;
    }

    @Override
    public Consult getById(Integer id) {

        return consultMapper.selectByPrimaryKey(id);
    }

    @Override
    public int delete(Integer id) {
        return consultMapper.deleteByPrimaryKey(id);
    }
}
