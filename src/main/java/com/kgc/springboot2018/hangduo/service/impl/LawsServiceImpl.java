package com.kgc.springboot2018.hangduo.service.impl;

import com.kgc.springboot2018.hangduo.mapper.LawMapper;
import com.kgc.springboot2018.hangduo.pojo.Law;
import com.kgc.springboot2018.hangduo.pojo.LawExample;
import com.kgc.springboot2018.hangduo.service.LawsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LawsServiceImpl implements LawsService {

    @Resource
    LawMapper lawMapper;

    @Override
    public List<Law> getList(String lawId, String lawName) {
        LawExample example=new LawExample();
        if (lawId!=null||lawName!=null) {
            if (lawName == "" && lawId == "") {
                return lawMapper.selectByExample(null);
            } else if (lawName == "" && lawId != "") {
                example.createCriteria().andLawIdLike("%"+lawId+"%");
                return lawMapper.selectByExample(example);
            } else if (lawName != "" && lawId == "") {
                example.createCriteria().andLawNameLike("%"+lawName+"%");
                return lawMapper.selectByExample(example);
            } else {
                example.createCriteria().andLawNameLike("%"+lawName+"%").andLawIdLike("%"+lawId+"%");
                return lawMapper.selectByExample(example);
            }
        }else {
            return lawMapper.selectByExample(null);
        }
    }

    @Override
    public int add(Law law) {
        return lawMapper.insertSelective(law);
    }

    @Override
    public int update(Law law) {
        return lawMapper.updateByPrimaryKeySelective(law);
    }


    @Override
    public int del(Integer id) {
        return lawMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Law select(Integer id) {
        return lawMapper.selectByPrimaryKey(id);
    }


}
