package com.kgc.springboot2018.hangduo.service.impl;

import com.kgc.springboot2018.hangduo.mapper.DirnameMapper;
import com.kgc.springboot2018.hangduo.pojo.Dirname;
import com.kgc.springboot2018.hangduo.pojo.DirnameExample;
import com.kgc.springboot2018.hangduo.service.DirnameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class DirnameServiceImpl implements DirnameService {
    @Resource
    DirnameMapper dirnameMapper;
    @Override
    public List<Dirname> selectAllByCata(int cataName) {
        DirnameExample dirnameExample = new DirnameExample();
        dirnameExample.createCriteria().andCataNameEqualTo(cataName).andCataIdEqualTo(0);
        List<Dirname> dirnames = dirnameMapper.selectByExample(dirnameExample);
        return dirnames;
    }

//    @Override
//    public List selectAll(int cataName) {
//        List<Dirname> dirnames = selectAllByCata(cataName);
//        List list = new ArrayList();
//        for (Dirname dirname : dirnames) {
//            Integer cid = dirname.getCid();
//            String cname = dirname.getCname();
//            DirnameExample dirnameExample = new DirnameExample();
//            dirnameExample.createCriteria().andCataNameEqualTo(cataName).andCataIdEqualTo(cid);
//            List<Dirname> dirnames1 = dirnameMapper.selectByExample(dirnameExample);
//            list.add(cname);
//            for (Dirname dirname1 : dirnames1) {
//                list.add(dirname1.getCname());
//            }
//        }
//        return list;
//    }
    @Override
    public Map<Dirname,List<Dirname>> selectAll(int cataName){
        List<Dirname> dirnames = selectAllByCata(cataName);
        Map<Dirname,List<Dirname>> map = new TreeMap<>();
        for (Dirname dirname : dirnames) {
            Integer cid = dirname.getCid();
            String cname = dirname.getCname();
            DirnameExample dirnameExample = new DirnameExample();
            dirnameExample.createCriteria().andCataNameEqualTo(cataName).andCataIdEqualTo(cid);
            List<Dirname> dirnames1 = dirnameMapper.selectByExample(dirnameExample);
            map.put(dirname,dirnames1);
        }
        return map;
    }

    @Override
    public int addDirname(Dirname dirname) {
        int i = countSortpx(dirname);
        if(i>0){
            DirnameExample dirnameExample = new DirnameExample();
            dirnameExample.createCriteria().andSortpxGreaterThanOrEqualTo(dirname.getSortpx()).andCataNameEqualTo(dirname.getCataName()).andCataIdEqualTo(0);
            List<Dirname> dirnames = dirnameMapper.selectByExample(dirnameExample);
            for (Dirname dirname1 : dirnames) {
                dirname1.setSortpx(dirname1.getSortpx()+1);
                dirnameMapper.updateByPrimaryKey(dirname1);
            }
            int j =dirnameMapper.insertSelective(dirname);
            return j;
        }else {
            int j =dirnameMapper.insertSelective(dirname);
            return j;
        }
    }

    @Override
    public int countSortpx(Dirname dirname) {
        Integer sortpx = dirname.getSortpx();
        DirnameExample dirnameExample = new DirnameExample();
        dirnameExample.createCriteria().andSortpxEqualTo(sortpx);
        int count = dirnameMapper.countByExample(dirnameExample);
        return count;
    }

    @Override
    public Dirname selectByCId(int cid) {
        Dirname dirname = dirnameMapper.selectByPrimaryKey(cid);
        return dirname;
    }

    @Override
    public int update(Dirname dirname) {
        int i = dirnameMapper.updateByPrimaryKeySelective(dirname);
        return i;
    }

    @Override
    public int adddownDirname(Dirname dirname) {
        int i = countSortpx(dirname);
        if(i>0){
            DirnameExample dirnameExample = new DirnameExample();
            dirnameExample.createCriteria().andSortpxGreaterThanOrEqualTo(dirname.getSortpx()).andCataNameEqualTo(dirname.getCataName()).andCataIdEqualTo(dirname.getCataId());
            List<Dirname> dirnames = dirnameMapper.selectByExample(dirnameExample);
            for (Dirname dirname1 : dirnames) {
                dirname1.setSortpx(dirname1.getSortpx()+1);
                dirnameMapper.updateByPrimaryKey(dirname1);
            }
            int j =dirnameMapper.insertSelective(dirname);
            return j;
        }else {
            int j =dirnameMapper.insertSelective(dirname);
            return j;
        }
    }
}
