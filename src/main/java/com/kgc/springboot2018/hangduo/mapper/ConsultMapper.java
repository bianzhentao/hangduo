package com.kgc.springboot2018.hangduo.mapper;

import com.kgc.springboot2018.hangduo.pojo.Consult;
import com.kgc.springboot2018.hangduo.pojo.ConsultExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsultMapper {
    int countByExample(ConsultExample example);

    int deleteByExample(ConsultExample example);

    int deleteByPrimaryKey(Integer zid);

    int insert(Consult record);

    int insertSelective(Consult record);

    List<Consult> selectByExample(ConsultExample example);

    Consult selectByPrimaryKey(Integer zid);

    int updateByExampleSelective(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByExample(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKey(Consult record);
}