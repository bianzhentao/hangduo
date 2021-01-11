package com.kgc.springboot2018.hangduo.service.impl;

import com.kgc.springboot2018.hangduo.mapper.CollectionMapper;
import com.kgc.springboot2018.hangduo.mapper.ConsultMapper;
import com.kgc.springboot2018.hangduo.pojo.Collection;
import com.kgc.springboot2018.hangduo.pojo.Consult;
import com.kgc.springboot2018.hangduo.service.ConsultService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsultServiceImpl implements ConsultService {

    @Resource
    ConsultMapper consultMapper;
    @Resource
    CollectionMapper collectionMapper;


    @Override
    public Integer addConsult(Consult consult) {

        return consultMapper.insertSelective(consult);
    }

    @Override
    public Integer addCollection(Collection collection) {

        return collectionMapper.insertSelective(collection);
    }


    @Override
    public List<Consult> getList() {
        List<Consult> consults = consultMapper.selectByExample(null);
        return consults;
    }

}
