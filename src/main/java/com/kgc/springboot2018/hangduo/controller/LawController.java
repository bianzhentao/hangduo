package com.kgc.springboot2018.hangduo.controller;

import com.kgc.springboot2018.hangduo.pojo.Law;
import com.kgc.springboot2018.hangduo.service.LawService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LawController {

    @Resource
    LawService lawService;

    @RequestMapping("/query")
    public String getAll(Model model,@Param("lawName")String lawName,@Param("lawId")String lawId){
//        String lawId=request.getParameter("lawId");
//        String lawName=request.getParameter("lawName");
//        System.out.println(lawId);
//        System.out.println(lawName);
        List<Law> list = lawService.getList(lawId, lawName);
//        System.out.println(list.toString());
        model.addAttribute("list",list);
        model.addAttribute("lawId",lawId);
        model.addAttribute("lawName",lawName);
        return "laws";
    }

    @RequestMapping("/add")
    public String toadd(){
        return "lawAdd";
    }

    @RequestMapping("/doadd")
    @ResponseBody
    public String add(Law law,HttpServletRequest request,Model model){
        String lawId=request.getParameter("lawId");
        String otherName=request.getParameter("otherName");
        String lawNum=request.getParameter("lawNum");
        String lawName=request.getParameter("lawName");
        String isshow=request.getParameter("isshow");
        String state=request.getParameter("state");
        law.setLawId(lawId);
        law.setOtherName(otherName);
        law.setIsshow(isshow);
        law.setLawName(lawName);
        law.setState(state);
        law.setLawNum(lawNum);
        if (lawService.add(law)>0){
            return "<script>alert('添加成功');location.href='/query'</script>";
        }else {
            return "<script>alert('添加失败');location.href='lawAdd.html'</script>";
        }
    }

    @RequestMapping("/update/{id}")
    public String update(HttpServletRequest request,Model model,@PathVariable("id")Integer id){
//        model.addAttribute("select",select);
        System.out.println(id);
        Law select = lawService.select(id);
        System.out.println(select.toString());
        model.addAttribute("select",select);
        return "lawUpdate";
    }

    @RequestMapping("/doupdate")
    @ResponseBody
    public String doupdate(HttpServletRequest request,Law law,@Param("id")Integer id){
        String lawId=request.getParameter("lawId");
        String otherName=request.getParameter("otherName");
        String lawNum=request.getParameter("lawNum");
        String lawName=request.getParameter("lawName");
        String isshow=request.getParameter("isshow");
        String state=request.getParameter("state");
        law.setLawId(lawId);
        law.setOtherName(otherName);
        law.setIsshow(isshow);
        law.setLawName(lawName);
        law.setState(state);
        law.setLawNum(lawNum);
        System.out.println(law.toString());
        int m=lawService.update(law);
        System.out.println(m);
        if (m>0){
            return "<script>alert('修改成功');location.href='/query'</script>";
        }else {
            return "<script>alert('修改失败');location.href='lawUpdate.html'</script>";
        }
    }


    @RequestMapping("/del")
    public String del(Integer id){
        int del = lawService.del(id);
        return "redirect:/query";
    }
}
