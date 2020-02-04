package com.accp.domain;

/**
 * 车辆类
 * @author asus
 *
 */
public class Vehicle {
    private String veeid;

    private String veebrand;

    private String veetype;

    private String veedriver;

    private String veedriverphone;

    private String veedate;

    private Integer ownershipid;

    private String veeexpires;

    private String veeframe;

    private String veeengine;

    private String veeyear;

    private String veemileage;

    private String endid;

    private Integer veeload;

    private String veepurchase;

    private String veeregistered;

    private String veevehicle;

    private String veecategory;

    private String veeseries;

    private String veeinsurance;

    private String veeexpire;

    private String veeflag;

    private String veebusiness;

    private String veebusexp;

    private String veeupkeep;

    private String veeupdate;

    private String cltid;

    private String res1;

    private String res2;

    private String res3;

    private String res4;

    private Integer res5;
    
    private Trademark trademark;//车型品牌对象
    
    private Client client;//客户对象
    
    private Ownership ownership;//车辆归属
    
    private Enginebrand enginebrand;//发动机品牌对象
    
    public void setEnginebrand(Enginebrand enginebrand) {
		this.enginebrand = enginebrand;
	}
    
    public Enginebrand getEnginebrand() {
		return enginebrand;
	}
    
    public void setOwnership(Ownership ownership) {
		this.ownership = ownership;
	}
    
    public Ownership getOwnership() {
		return ownership;
	}
    
    public void setClient(Client client) {
		this.client = client;
	}
    
    public Client getClient() {
		return client;
	}
    
    public void setTrademark(Trademark trademark) {
		this.trademark = trademark;
	}
    
    public Trademark getTrademark() {
		return trademark;
	}

    public String getVeeid() {
        return veeid;
    }

    public void setVeeid(String veeid) {
        this.veeid = veeid;
    }

    public String getVeebrand() {
        return veebrand;
    }

    public void setVeebrand(String veebrand) {
        this.veebrand = veebrand;
    }

    public String getVeetype() {
        return veetype;
    }

    public void setVeetype(String veetype) {
        this.veetype = veetype;
    }

    public String getVeedriver() {
        return veedriver;
    }

    public void setVeedriver(String veedriver) {
        this.veedriver = veedriver;
    }

    public String getVeedriverphone() {
        return veedriverphone;
    }

    public void setVeedriverphone(String veedriverphone) {
        this.veedriverphone = veedriverphone;
    }

    public String getVeedate() {
        return veedate;
    }

    public void setVeedate(String veedate) {
        this.veedate = veedate;
    }

    public Integer getOwnershipid() {
        return ownershipid;
    }

    public void setOwnershipid(Integer ownershipid) {
        this.ownershipid = ownershipid;
    }

    public String getVeeexpires() {
        return veeexpires;
    }

    public void setVeeexpires(String veeexpires) {
        this.veeexpires = veeexpires;
    }

    public String getVeeframe() {
        return veeframe;
    }

    public void setVeeframe(String veeframe) {
        this.veeframe = veeframe;
    }

    public String getVeeengine() {
        return veeengine;
    }

    public void setVeeengine(String veeengine) {
        this.veeengine = veeengine;
    }

    public String getVeeyear() {
        return veeyear;
    }

    public void setVeeyear(String veeyear) {
        this.veeyear = veeyear;
    }

    public String getVeemileage() {
        return veemileage;
    }

    public void setVeemileage(String veemileage) {
        this.veemileage = veemileage;
    }

    public String getEndid() {
        return endid;
    }

    public void setEndid(String endid) {
        this.endid = endid;
    }

    public Integer getVeeload() {
        return veeload;
    }

    public void setVeeload(Integer veeload) {
        this.veeload = veeload;
    }

    public String getVeepurchase() {
        return veepurchase;
    }

    public void setVeepurchase(String veepurchase) {
        this.veepurchase = veepurchase;
    }

    public String getVeeregistered() {
        return veeregistered;
    }

    public void setVeeregistered(String veeregistered) {
        this.veeregistered = veeregistered;
    }

    public String getVeevehicle() {
        return veevehicle;
    }

    public void setVeevehicle(String veevehicle) {
        this.veevehicle = veevehicle;
    }

    public String getVeecategory() {
        return veecategory;
    }

    public void setVeecategory(String veecategory) {
        this.veecategory = veecategory;
    }

    public String getVeeseries() {
        return veeseries;
    }

    public void setVeeseries(String veeseries) {
        this.veeseries = veeseries;
    }

    public String getVeeinsurance() {
        return veeinsurance;
    }

    public void setVeeinsurance(String veeinsurance) {
        this.veeinsurance = veeinsurance;
    }

    public String getVeeexpire() {
        return veeexpire;
    }

    public void setVeeexpire(String veeexpire) {
        this.veeexpire = veeexpire;
    }

    public String getVeeflag() {
        return veeflag;
    }

    public void setVeeflag(String veeflag) {
        this.veeflag = veeflag;
    }

    public String getVeebusiness() {
        return veebusiness;
    }

    public void setVeebusiness(String veebusiness) {
        this.veebusiness = veebusiness;
    }

    public String getVeebusexp() {
        return veebusexp;
    }

    public void setVeebusexp(String veebusexp) {
        this.veebusexp = veebusexp;
    }

    public String getVeeupkeep() {
        return veeupkeep;
    }

    public void setVeeupkeep(String veeupkeep) {
        this.veeupkeep = veeupkeep;
    }

    public String getVeeupdate() {
        return veeupdate;
    }

    public void setVeeupdate(String veeupdate) {
        this.veeupdate = veeupdate;
    }

    public String getCltid() {
        return cltid;
    }

    public void setCltid(String cltid) {
        this.cltid = cltid;
    }

    public String getRes1() {
        return res1;
    }

    public void setRes1(String res1) {
        this.res1 = res1;
    }

    public String getRes2() {
        return res2;
    }

    public void setRes2(String res2) {
        this.res2 = res2;
    }

    public String getRes3() {
        return res3;
    }

    public void setRes3(String res3) {
        this.res3 = res3;
    }

    public String getRes4() {
        return res4;
    }

    public void setRes4(String res4) {
        this.res4 = res4;
    }

    public Integer getRes5() {
        return res5;
    }

    public void setRes5(Integer res5) {
        this.res5 = res5;
    }
}