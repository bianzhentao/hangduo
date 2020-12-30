package com.kgc.springboot2018.hangduo.service;

import com.kgc.springboot2018.hangduo.pojo.Dirname;

import java.util.List;
import java.util.Map;

public interface DirnameService {
    List<Dirname> selectAllByCata(int cataName);
    public Map<Dirname,List<Dirname>> selectAll(int cataName);
//    List selectAll(int cataName);
    //添加
    int addDirname(Dirname dirname);
    //是否有重复的同级序号
    int countSortpx(Dirname dirname);
    //修改对象查询
    Dirname selectByCId(int cid);
    //修改
    int update(Dirname dirname);
    //添加下级菜单
    int adddownDirname(Dirname dirname);
}
