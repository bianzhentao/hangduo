package com.kgc.springboot2018.hangduo.mapper;

import com.kgc.springboot2018.hangduo.pojo.Clause;
import com.kgc.springboot2018.hangduo.pojo.ClauseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClauseMapper {
    int countByExample(ClauseExample example);

    int deleteByExample(ClauseExample example);

    int deleteByPrimaryKey(String clauseId);

    int insert(Clause record);

    int insertSelective(Clause record);

    List<Clause> selectByExample(ClauseExample example);

    Clause selectByPrimaryKey(String clauseId);

    int updateByExampleSelective(@Param("record") Clause record, @Param("example") ClauseExample example);

    int updateByExample(@Param("record") Clause record, @Param("example") ClauseExample example);

    int updateByPrimaryKeySelective(Clause record);

    int updateByPrimaryKey(Clause record);
}