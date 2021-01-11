package com.kgc.springboot2018.hangduo.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.springboot2018.hangduo.pojo.Law;
import com.kgc.springboot2018.hangduo.service.Lawservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class zhuyecontroller {
    @Resource
    Lawservice lawservice;
    @RequestMapping("/zhuyee")
    public String zhuye(Model model,
                        @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                        @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, String law){
        PageInfo<Law> pageInfo = lawservice.page(pageNum, pageSize, law);
model.addAttribute("pageInfo",pageInfo);
model.addAttribute("law",law);
        return "zhuye";
    }

}
