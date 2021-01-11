package com.kgc.springboot2018.hangduo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.springboot2018.hangduo.mapper.LawMapper;
import com.kgc.springboot2018.hangduo.pojo.Law;
import com.kgc.springboot2018.hangduo.pojo.LawExample;
import com.kgc.springboot2018.hangduo.service.LawService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LawServiceImpl implements LawService {
    @Resource
    LawMapper lawMapper;
    @Override
    public List<Law> selecta(Integer id) {
        return null;
    }

    @Override
    public PageInfo<Law> page(Integer pageName, Integer pageSize, String lawId) {
        PageHelper.startPage(pageName,pageSize);
        if (lawId!=""&&lawId!=null){
            LawExample example=new LawExample();
            example.createCriteria().andLawIdEqualTo(lawId);
            List<Law> invitations = lawMapper.selectByExample(example);
            PageInfo<Law> pageInfo=new PageInfo<>(invitations);
            return pageInfo;
        }else {
            List<Law> laws = lawMapper.selectByExample(null);
            PageInfo<Law> pageInfo=new PageInfo<>(laws);
            return pageInfo;
        }

    }
}
