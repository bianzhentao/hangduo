package com.kgc.springboot2018.hangduo.service.impl;

import com.kgc.springboot2018.hangduo.mapper.CollectionMapper;
import com.kgc.springboot2018.hangduo.mapper.LawMapper;
import com.kgc.springboot2018.hangduo.pojo.Collection;
import com.kgc.springboot2018.hangduo.pojo.CollectionExample;
import com.kgc.springboot2018.hangduo.pojo.Law;
import com.kgc.springboot2018.hangduo.service.XkaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class XkaServiceImpl implements XkaService {
    @Resource
    CollectionMapper collectionMapper;
    @Resource
    LawMapper lawMapper;

    @Override
    public int getCount(int cuid, int clid) {
        CollectionExample collectionExample = new CollectionExample();
        collectionExample.createCriteria().andCuidEqualTo(cuid).andClidEqualTo(clid);
        return collectionMapper.countByExample(collectionExample);
    }

    @Override
    public int addCollection(Collection collection) {
        return collectionMapper.insertSelective(collection);
    }

    @Override
    public Law getLaw(int id) {
        return lawMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Law> getLawAll(int uid) {
        CollectionExample collectionExample = new CollectionExample();
        collectionExample.createCriteria().andCuidEqualTo(uid);
        List<Collection> collections = collectionMapper.selectByExample(collectionExample);
        List<Law> lawList = new ArrayList<>();
        for (Collection collection : collections) {
            Law law = lawMapper.selectByPrimaryKey(collection.getClid());
            lawList.add(law);
        }
        return lawList;
    }


}
