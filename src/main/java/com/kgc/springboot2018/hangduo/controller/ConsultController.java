package com.kgc.springboot2018.hangduo.controller;

import com.kgc.springboot2018.hangduo.pojo.Collection;
import com.kgc.springboot2018.hangduo.pojo.Consult;

import com.kgc.springboot2018.hangduo.service.ConsultService;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;


@Controller
public class ConsultController {

    @Resource
    ConsultService consultService;


    @RequestMapping("/zx")
    public String add1(){
        return "/addzx";
    }

    @RequestMapping("/dozx")
    @ResponseBody
    public String add(HttpServletRequest request) throws IOException {

        String zname=request.getParameter("zname");
        String zphone=request.getParameter("zphone");
        String zaddress=request.getParameter("zaddress");
        String zemail=request.getParameter("zemail");
        String wechatName=request.getParameter("wechatName");
        String lawsNum=request.getParameter("lawsNum");
        String zcontent=request.getParameter("zcontent");
        int max=10,min=1;
//        Integer conId=(int)System.nanoTime();
        Integer conId=(int) (Math.random()*(max-min)+min);
        Collection collection=new Collection();
        Consult consult=new Consult();
        consult.setConId(conId);
        consult.setZname(zname);
        consult.setZphone(zphone);
        consult.setZaddress(zaddress);
        consult.setZemail(zemail);
        consult.setWechatName(wechatName);
        consult.setLawsNum(lawsNum);
        consult.setZcontent(zcontent);
        collection.setId(conId);

        Integer i = consultService.addConsult(consult);
        System.out.println(consult.toString());
        if(i>0){
            consultService.addCollection(collection);
            return "<script>alert('添加成功');location.href='lszx'</script>";
        }else {
            return "<script>alert('添加失败');location.href='addzx.html'</script>";
        }
    }

    @RequestMapping("/lszx")
    public String lszx(Model model){
        List<Consult> list = consultService.getList();
        model.addAttribute("list",list);
        return "lszx";
    }
}
