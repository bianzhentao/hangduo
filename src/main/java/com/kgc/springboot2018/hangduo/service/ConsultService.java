package com.kgc.springboot2018.hangduo.service;

import com.github.pagehelper.PageInfo;
import com.kgc.springboot2018.hangduo.pojo.Consult;

public interface ConsultService {
    //根据手机号或者内容模糊查U型，并显示数据
    PageInfo<Consult> getListx(Integer PageNum, Integer pageSize, String typesel);
    //通过主键查询显示对象具体信息
    Consult getById(Integer id);

    //删除的方法
    int delete(Integer id);
}
