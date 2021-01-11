package com.kgc.springboot2018.hangduo.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.springboot2018.hangduo.pojo.Collection;
import com.kgc.springboot2018.hangduo.pojo.Law;
import com.kgc.springboot2018.hangduo.pojo.User;
import com.kgc.springboot2018.hangduo.service.LawService;
import com.kgc.springboot2018.hangduo.service.XkaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.util.resources.cldr.wae.LocaleNames_wae;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class zhuyecontroller {
    @Resource
    LawService lawservice;
    @Resource
    XkaService xkaService;
    @RequestMapping("/zhuyee")
    public String zhuye(Model model,
                        @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                        @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize, String law){
        PageInfo<Law> pageInfo = lawservice.page(pageNum, pageSize, law);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("law",law);
        return "zhuye";
    }
    @RequestMapping("/sc")
    public String sc(int id, HttpSession session, HttpServletResponse response) throws IOException {
        User user = (User)session.getAttribute("login");
        Integer uid = user.getId();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int count = xkaService.getCount(uid, id);
        if(count>0){
            out.print("<script>alert('已收藏，请勿重复添加！')</script>");
            out.flush();
        }else {
            Collection collection = new Collection();
            collection.setCuid(uid);
            collection.setClid(id);
            int i = xkaService.addCollection(collection);
            if(i>0){
                out.print("<script>alert('收藏成功！')</script>");
                out.flush();
            }else{
                out.print("<script>alert('收藏失败！')</script>");
                out.flush();
            }
        }
        Law law = xkaService.getLaw(id);
        String lawId = law.getLawId();
        return "forward:/zhuyee?law="+lawId;
    }
    @RequestMapping("/wdsc")
    public String wdsc(HttpSession session,Model model){
        User user = (User)session.getAttribute("login");
        Integer uid = user.getId();
        List<Law> lawlist = xkaService.getLawAll(uid);
        model.addAttribute("lawlist",lawlist);
        return "wdsc";
    }
    @RequestMapping("/xkaout")
    public String out(HttpSession session){
        session.invalidate();
        return "title";
    }
}
