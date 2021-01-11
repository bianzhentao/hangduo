package com.kgc.springboot2018.hangduo.service;

import com.kgc.springboot2018.hangduo.pojo.Collection;
import com.kgc.springboot2018.hangduo.pojo.Law;

import java.util.List;

public interface XkaService {
    //收藏是否重复
    int getCount(int cuid, int clid);
    //收藏
    int addCollection(Collection collection);
    //法律表id查询lawid
    Law getLaw(int id);
    //我的收藏
    List<Law> getLawAll(int uid);
}
