package com.kgc.springboot2018.hangduo.pojo;

import java.util.Date;

public class Consult {
    private Integer zid;

    private String zcontent;

    private String zphone;

    private Date ztime;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getZcontent() {
        return zcontent;
    }

    public void setZcontent(String zcontent) {
        this.zcontent = zcontent == null ? null : zcontent.trim();
    }

    public String getZphone() {
        return zphone;
    }

    public void setZphone(String zphone) {
        this.zphone = zphone == null ? null : zphone.trim();
    }

    public Date getZtime() {
        return ztime;
    }

    public void setZtime(Date ztime) {
        this.ztime = ztime;
    }
}