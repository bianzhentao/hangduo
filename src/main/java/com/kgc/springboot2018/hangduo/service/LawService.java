package com.kgc.springboot2018.hangduo.service;

import com.kgc.springboot2018.hangduo.pojo.Law;

import java.util.List;

public interface LawService {
    List<Law> getList(String lawId,String lawName);
    int add(Law law);
    int update(Law law);
    int del(Integer id);
    Law select(Integer id);
}
