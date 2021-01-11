package com.kgc.springboot2018.hangduo.pojo;

public class Law {
    private Integer id;

    private String lawId;

    private String otherName;

    private String lawNum;

    private String lawName;

    private String isshow;

    private String state;

    @Override
    public String toString() {
        return "Law{" +
                "id=" + id +
                ", lawId='" + lawId + '\'' +
                ", otherName='" + otherName + '\'' +
                ", lawNum='" + lawNum + '\'' +
                ", lawName='" + lawName + '\'' +
                ", isshow='" + isshow + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLawId() {
        return lawId;
    }

    public void setLawId(String lawId) {
        this.lawId = lawId == null ? null : lawId.trim();
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName == null ? null : otherName.trim();
    }

    public String getLawNum() {
        return lawNum;
    }

    public void setLawNum(String lawNum) {
        this.lawNum = lawNum == null ? null : lawNum.trim();
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName == null ? null : lawName.trim();
    }

    public String getIsshow() {
        return isshow;
    }

    public void setIsshow(String isshow) {
        this.isshow = isshow == null ? null : isshow.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}