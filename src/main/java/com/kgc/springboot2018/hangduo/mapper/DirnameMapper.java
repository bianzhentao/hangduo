package com.kgc.springboot2018.hangduo.mapper;

import com.kgc.springboot2018.hangduo.pojo.Dirname;
import com.kgc.springboot2018.hangduo.pojo.DirnameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DirnameMapper {
    int countByExample(DirnameExample example);

    int deleteByExample(DirnameExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Dirname record);

    int insertSelective(Dirname record);

    List<Dirname> selectByExample(DirnameExample example);

    Dirname selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Dirname record, @Param("example") DirnameExample example);

    int updateByExample(@Param("record") Dirname record, @Param("example") DirnameExample example);

    int updateByPrimaryKeySelective(Dirname record);

    int updateByPrimaryKey(Dirname record);
}