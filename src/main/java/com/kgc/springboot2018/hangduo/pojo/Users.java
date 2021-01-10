package com.kgc.springboot2018.hangduo.pojo;

import java.util.Date;

public class Users {
    private Integer uid;

    private String upName;

    private String upPhone;

    private Integer upSex;

    private Integer upViptype;

    private Date upDate;

    private String ipPassword;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUpName() {
        return upName;
    }

    public void setUpName(String upName) {
        this.upName = upName == null ? null : upName.trim();
    }

    public String getUpPhone() {
        return upPhone;
    }

    public void setUpPhone(String upPhone) {
        this.upPhone = upPhone == null ? null : upPhone.trim();
    }

    public Integer getUpSex() {
        return upSex;
    }

    public void setUpSex(Integer upSex) {
        this.upSex = upSex;
    }

    public Integer getUpViptype() {
        return upViptype;
    }

    public void setUpViptype(Integer upViptype) {
        this.upViptype = upViptype;
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    public String getIpPassword() {
        return ipPassword;
    }

    public void setIpPassword(String ipPassword) {
        this.ipPassword = ipPassword == null ? null : ipPassword.trim();
    }
}