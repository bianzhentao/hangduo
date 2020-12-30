package com.kgc.springboot2018.hangduo.service;

import com.kgc.springboot2018.hangduo.pojo.Catalog;

import java.util.List;

public interface CatalogService {
    List<Catalog> getAll();
    Catalog selectById(int id);
}
