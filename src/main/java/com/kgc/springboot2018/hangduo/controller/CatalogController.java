package com.kgc.springboot2018.hangduo.controller;

import com.kgc.springboot2018.hangduo.mapper.DirnameMapper;
import com.kgc.springboot2018.hangduo.pojo.Catalog;
import com.kgc.springboot2018.hangduo.pojo.Dirname;
import com.kgc.springboot2018.hangduo.service.CatalogService;
import com.kgc.springboot2018.hangduo.service.DirnameService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class CatalogController {
    @Resource
    CatalogService catalogService;
    @Resource
    DirnameService dirnameService;
    @RequestMapping("/cata")
    public String catalog(Model model){
        List<Catalog> catalogs= catalogService.getAll();
        model.addAttribute("catalogs",catalogs);
        return "catalog";
    }
    @RequestMapping("/select")
    public String select(Model model, HttpServletRequest request){
        Integer cataName = Integer.parseInt(request.getParameter("cataName"));
        Map<Dirname, List<Dirname>> map = dirnameService.selectAll(cataName);
        List<Catalog> catalogs= catalogService.getAll();
        model.addAttribute("cataName",cataName);
        model.addAttribute("catalogs",catalogs);
        model.addAttribute("map",map);
        return "catalog";
    }
    @RequestMapping("/doadd")
    public String doadd(Model model){
        List<Catalog> catalogs= catalogService.getAll();
        model.addAttribute("catalogs",catalogs);
        return "addcatalog";
    }
    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        String canme = request.getParameter("cname");
        Integer sortpx = Integer.parseInt(request.getParameter("sortpx"));
        int cataName = Integer.parseInt(request.getParameter("cataName"));
        Dirname dirname = new Dirname();
        dirname.setSortpx(sortpx);
        dirname.setCataId(0);
        dirname.setCataName(cataName);
        dirname.setCname(canme);
        int i = dirnameService.addDirname(dirname);
        return "forward:/select?cataName="+cataName;
    }
    @RequestMapping("/update")
    public String update(HttpServletRequest request,Model model){
        int cid = Integer.parseInt(request.getParameter("cid"));
        Dirname dirname = dirnameService.selectByCId(cid);
        Integer cataName = dirname.getCataName();
        Catalog catalog = catalogService.selectById(cataName);
//        List<Catalog> all = catalogService.getAll();
        model.addAttribute("dirname",dirname);
        model.addAttribute("catalog",catalog);
//        model.addAttribute("all",all);
        return "updatecatalog";
    }
    @RequestMapping("/doupdate")
    public String doupdate(HttpServletRequest request){
        int cid = Integer.parseInt(request.getParameter("cid"));
        String cname = request.getParameter("cname");
        int cataName = Integer.parseInt(request.getParameter("cataName"));
        Dirname dirname = new Dirname();
        dirname.setCid(cid);
        dirname.setCname(cname);
        int i = dirnameService.update(dirname);
        return "forward:/select?cataName="+cataName;
    }
    @RequestMapping("/adddown")
    public String addDown(HttpServletRequest request, Model model){
        int cid = Integer.parseInt(request.getParameter("cid"));
        Dirname dirname = dirnameService.selectByCId(cid);
        Integer cataName = dirname.getCataName();
        Catalog catalog = catalogService.selectById(cataName);
        model.addAttribute("catalog",catalog);
        model.addAttribute("dirname",dirname);
        return "adddown";
    }
    @RequestMapping("/doadddown")
    public String doaddDown(HttpServletRequest request, Model model){
        String cname = request.getParameter("cname");
        int sortpx = Integer.parseInt(request.getParameter("sortpx"));
        int cataName = Integer.parseInt(request.getParameter("cataName"));
        int cataId = Integer.parseInt(request.getParameter("cataId"));
        Dirname dirname = new Dirname();
        dirname.setCname(cname);
        dirname.setCataName(cataName);
        dirname.setCataId(cataId);
        dirname.setSortpx(sortpx);
        int i = dirnameService.adddownDirname(dirname);
        return "forward:/select?cataName="+cataName;
    }
}
