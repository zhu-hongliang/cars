package com.accp.domain;

import java.util.List;

/**
 * 省
 * @author asus
 *
 */
public class Province {
    private Integer provinceid;

    private String provincename;
    
    private List<City> citys;//市集合
    
    public void setCitys(List<City> citys) {
		this.citys = citys;
	}
    
    public List<City> getCitys() {
		return citys;
	}

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }
}