package com.accp.domain;

public class Module {
    private Integer moeid;

    private String moename;

    private Integer parentid;

    private Integer moetype;

    private String path;

    public Integer getMoeid() {
        return moeid;
    }

    public void setMoeid(Integer moeid) {
        this.moeid = moeid;
    }

    public String getMoename() {
        return moename;
    }

    public void setMoename(String moename) {
        this.moename = moename;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getMoetype() {
        return moetype;
    }

    public void setMoetype(Integer moetype) {
        this.moetype = moetype;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}