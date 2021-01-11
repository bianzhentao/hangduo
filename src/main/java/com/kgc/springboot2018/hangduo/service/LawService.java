package com.kgc.springboot2018.hangduo.service;

import com.github.pagehelper.PageInfo;
import com.kgc.springboot2018.hangduo.pojo.Law;

import java.util.List;

public interface LawService {
    List<Law> selecta(Integer id);
    /*分页模糊查询*/
    PageInfo<Law> page(Integer pageName, Integer pageSize, String lawId);
}
