package com.kgc.springboot2018.hangduo.service;

import com.kgc.springboot2018.hangduo.pojo.Collection;
import com.kgc.springboot2018.hangduo.pojo.Consult;

import java.util.List;

public interface ConsultService {
    /**
     *
     * @param consult
     * @return
     * 添加
     */
    Integer addConsult(Consult consult);

    Integer addCollection(Collection collection);
    /**
     * 查询历史
     */
    List<Consult> getList();
}
