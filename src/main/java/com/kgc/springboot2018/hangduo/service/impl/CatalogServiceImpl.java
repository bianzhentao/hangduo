package com.kgc.springboot2018.hangduo.service.impl;

import com.kgc.springboot2018.hangduo.mapper.CatalogMapper;
import com.kgc.springboot2018.hangduo.pojo.Catalog;
import com.kgc.springboot2018.hangduo.service.CatalogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CatalogServiceImpl implements CatalogService {
    @Resource
    CatalogMapper catalogMapper;
    @Override
    public List<Catalog> getAll() {
        List<Catalog> catalogs = catalogMapper.selectByExample(null);
        return catalogs;
    }

    @Override
    public Catalog selectById(int id) {
        return catalogMapper.selectByPrimaryKey(id);
    }
}
