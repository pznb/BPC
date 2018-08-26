package org.pznb.bpc.entity;

import java.util.Date;

/**
 * (TBpcParkingSite)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
public class ParkingSite {
    /**停车场网点编号*/
    private String siteNo;
    /**省*/
    private String province;
    /**市*/
    private String city;
    /**区*/
    private String area;
    /**街道*/
    private String street;
    /**网点地址*/
    private String siteName;
    /**地址备注*/
    private String note;
    /**停车场网点注册时间*/
    private Date regTime;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;


    public String getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(String siteNo) {
        this.siteNo = siteNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1;
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }

}