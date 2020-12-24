package com.kgc.springboot2018.hangduo.mapper;

import com.kgc.springboot2018.hangduo.pojo.Catalog;
import com.kgc.springboot2018.hangduo.pojo.CatalogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CatalogMapper {
    int countByExample(CatalogExample example);

    int deleteByExample(CatalogExample example);

    int deleteByPrimaryKey(Integer catalogId);

    int insert(Catalog record);

    int insertSelective(Catalog record);

    List<Catalog> selectByExample(CatalogExample example);

    Catalog selectByPrimaryKey(Integer catalogId);

    int updateByExampleSelective(@Param("record") Catalog record, @Param("example") CatalogExample example);

    int updateByExample(@Param("record") Catalog record, @Param("example") CatalogExample example);

    int updateByPrimaryKeySelective(Catalog record);

    int updateByPrimaryKey(Catalog record);
}