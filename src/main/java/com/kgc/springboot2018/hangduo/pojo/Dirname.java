package com.kgc.springboot2018.hangduo.pojo;

public class Dirname implements Comparable{
    private Integer cid;

    private Integer cataName;

    private Integer cataId;

    private String cname;

    private Integer sortpx;

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

    public Integer getSortpx() {
        return sortpx;
    }

    public void setSortpx(Integer sortpx) {
        this.sortpx = sortpx;
    }

    @Override
    public int compareTo(Object obj) {
        Dirname dirname=(Dirname)obj;
        int num1 = this.getSortpx()-dirname.getSortpx();
        int num2 = num1==0?this.getCid().compareTo(dirname.getCid()):num1;
        return num2;
    }
}