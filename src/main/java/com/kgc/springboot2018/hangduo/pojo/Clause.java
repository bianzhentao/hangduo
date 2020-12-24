package com.kgc.springboot2018.hangduo.pojo;

public class Clause {
    private String clauseId;

    private String clauseRealname;

    private String clauseTitle;

    private String clauseName;

    private String clauseNum;

    public String getClauseId() {
        return clauseId;
    }

    public void setClauseId(String clauseId) {
        this.clauseId = clauseId == null ? null : clauseId.trim();
    }

    public String getClauseRealname() {
        return clauseRealname;
    }

    public void setClauseRealname(String clauseRealname) {
        this.clauseRealname = clauseRealname == null ? null : clauseRealname.trim();
    }

    public String getClauseTitle() {
        return clauseTitle;
    }

    public void setClauseTitle(String clauseTitle) {
        this.clauseTitle = clauseTitle == null ? null : clauseTitle.trim();
    }

    public String getClauseName() {
        return clauseName;
    }

    public void setClauseName(String clauseName) {
        this.clauseName = clauseName == null ? null : clauseName.trim();
    }

    public String getClauseNum() {
        return clauseNum;
    }

    public void setClauseNum(String clauseNum) {
        this.clauseNum = clauseNum == null ? null : clauseNum.trim();
    }
}