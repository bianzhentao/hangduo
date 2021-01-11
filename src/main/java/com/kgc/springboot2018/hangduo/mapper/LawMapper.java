package com.kgc.springboot2018.hangduo.mapper;

import com.kgc.springboot2018.hangduo.pojo.Law;
import com.kgc.springboot2018.hangduo.pojo.LawExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LawMapper {
    int countByExample(LawExample example);

    int deleteByExample(LawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Law record);

    int insertSelective(Law record);

    List<Law> selectByExample(LawExample example);

    Law selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Law record, @Param("example") LawExample example);

    int updateByExample(@Param("record") Law record, @Param("example") LawExample example);

    int updateByPrimaryKeySelective(Law record);

    int updateByPrimaryKey(Law record);
}