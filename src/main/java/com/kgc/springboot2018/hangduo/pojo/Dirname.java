package com.kgc.springboot2018.hangduo.pojo;

public class Dirname {
    private Integer cid;

    private Integer cataName;

    private Integer cataId;

    private String cname;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCataName() {
        return cataName;
    }

    public void setCataName(Integer cataName) {
        this.cataName = cataName;
    }

    public Integer getCataId() {
        return cataId;
    }

    public void setCataId(Integer cataId) {
        this.cataId = cataId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }
}