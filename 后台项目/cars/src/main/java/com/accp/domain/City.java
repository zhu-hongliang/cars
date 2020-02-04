package com.accp.domain;

import java.util.List;

public class City {
    private Integer cityid;

    private String cityname;

    private Integer provinceid;
    
    private List<District> districts;//区集合
    
    public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
    
    public List<District> getDistricts() {
		return districts;
	}

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }
}