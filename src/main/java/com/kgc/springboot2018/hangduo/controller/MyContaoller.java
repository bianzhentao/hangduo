package com.kgc.springboot2018.hangduo.controller;

import com.github.pagehelper.PageInfo;
import com.kgc.springboot2018.hangduo.pojo.Consult;
import com.kgc.springboot2018.hangduo.pojo.Users;
import com.kgc.springboot2018.hangduo.service.ConsultService;
import com.kgc.springboot2018.hangduo.service.XUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class MyContaoller {
    @Resource
    ConsultService consultService;
    @Resource
    XUsersService xUsersService;



    @RequestMapping("zixun")
    public String zixun(@RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNnm,
                        @RequestParam(value = "typesel",required =false) String typesel,Model model
                        ){
        //System.out.println(typesel+"输入框获取的值");
        Integer pageSize=2;
        PageInfo<Consult> pageInfo = consultService.getListx(pageNnm, pageSize, typesel);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("typesel",typesel);
        return "consu";
    }

    @RequestMapping("/cha")
    public String tanchuan(@RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNnm,
                           @RequestParam(value = "typesel",required =false) String typesel,Model model,
                           @RequestParam(value = "id",required =false)Integer id
                           ){
        Consult consult = consultService.getById(id);
      //  System.out.println(id+"这个是id");
        Integer pageSize=2;
        PageInfo <Consult> pageInfo = consultService.getListx(pageNnm, pageSize, typesel);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("typesel",typesel);
        //model.addAttribute("consult",consult.getZcontent());
//        System.out.println(consult.getZcontent());
      //  System.out.println("进来了");
        return "consu";
    }


    @RequestMapping("/del")
    @ResponseBody
    public void del(Integer id, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        int i = consultService.delete(id);
        boolean flag=false;
        if(i>0){
            flag=true;
        }
        out.print(flag);
    }
   /* @RequestMapping("/tan")
    public String tan(@RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNnm,
                      @RequestParam(value = "typesel",required =false) String typesel,Model model,
                      @RequestParam(value = "id",required =false)Integer id) {

        Consult consult = consultService.getById(id);
        System.out.println(id+"这个是id");
        Integer pageSize=4;
        PageInfo <Consult> pageInfo = consultService.getListx(pageNnm, pageSize, typesel);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("typesel",typesel);
//        model.addAttribute("consult",consult.getZcontent());
//        System.out.println(consult.getZcontent());

        return "tan";
    }*/

    @RequestMapping("ce")
    @ResponseBody
    public void ceshi(@RequestParam(value = "id",required =false)Integer id,
                      HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");


        PrintWriter out = response.getWriter();

        Consult consult = consultService.getById(id);
       // System.out.println(consult.getZcontent());
        out.print(consult.getZcontent());

    }
    @RequestMapping("/yanPhone")
    @ResponseBody
    public void yanpoone(@RequestParam(required = false,defaultValue = "18235389217")String userPhone,
                         @RequestParam(required = false)String userpas,
                         HttpServletResponse response

                        ) throws IOException {
        PrintWriter out = response.getWriter();
        Users users = xUsersService.getByPhone(userPhone);
        System.out.println(userpas+"获取的密码和对象"+users.getIpPassword());
        boolean flag=true;
        if(users.getIpPassword().equals(userpas)){
            flag=false;
        }
        out.print(flag);
        System.out.println(flag+"zhesgu");
    }



    //修改密码
    @RequestMapping("/updatepass")
    public String updatepass(String userphone,String pwd1,HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        System.out.println(userphone+"这是手机号和新密码"+pwd1);
        if( xUsersService.updatepwdByPho(userphone,pwd1)!=0){
            out.print("<script>alert('修改失败，请重新修改');location.href='/uppas'</script>");
        }
        return "";
    }


    @RequestMapping("/chainfo")//需要带参过来一个手机号
    public  String  chaInfo(@RequestParam(required = false,defaultValue = "18235389217") String phone
                            ,Model model
                            ){
        Users users = xUsersService.getByPhone(phone);
        model.addAttribute("users",users);
        return "info";
    }
}
