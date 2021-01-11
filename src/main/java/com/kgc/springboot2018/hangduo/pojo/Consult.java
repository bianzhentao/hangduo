package com.kgc.springboot2018.hangduo.pojo;

import java.util.Date;

public class Consult {
    private Integer zid;

    private String zcontent;

    private String zphone;

    private Date ztime;

    private String zaddress;

    private String wechatName;

    private String lawsNum;

    private Integer conId;

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

    public String getZaddress() {
        return zaddress;
    }

    public void setZaddress(String zaddress) {
        this.zaddress = zaddress == null ? null : zaddress.trim();
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName == null ? null : wechatName.trim();
    }

    public String getLawsNum() {
        return lawsNum;
    }

    public void setLawsNum(String lawsNum) {
        this.lawsNum = lawsNum == null ? null : lawsNum.trim();
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }
}