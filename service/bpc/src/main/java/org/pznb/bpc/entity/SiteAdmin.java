package org.pznb.bpc.entity;

import org.pznb.bpc.base.BaseEntity;

import java.util.Date;

/**
 * (TBpcSiteAdmin)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
public class SiteAdmin extends BaseEntity {
    private static final long serialVersionUID = -6914383262683588862L;

    /**管理员编号*/
    private String adminNo;
    /**管理员所在网点*/
    private String siteNo;
    /**管理员名字*/
    private String adminName;
    /**管理员电话号码*/
    private String adminPhoneNo;
    /**管理员性别 1、男 2、女*/
    private Integer adminSex;
    /**管理员密码*/
    private String adminPassword;
    /**管理员在职状态*/
    private Integer adminStatus;
    /**admin注册时间*/
    private Date regTime;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;


    public String getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    public String getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(String siteNo) {
        this.siteNo = siteNo;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPhoneNo() {
        return adminPhoneNo;
    }

    public void setAdminPhoneNo(String adminPhoneNo) {
        this.adminPhoneNo = adminPhoneNo;
    }

    public Integer getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(Integer adminSex) {
        this.adminSex = adminSex;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
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