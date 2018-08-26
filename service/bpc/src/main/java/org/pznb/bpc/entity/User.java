package org.pznb.bpc.entity;

import org.pznb.bpc.base.BaseEntity;

import java.util.Date;

/**
 * (TBpcUser)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
public class User extends BaseEntity {
    private static final long serialVersionUID = 701638677479955536L;

    /**用户名*/
    private String username;
    /**用户密码*/
    private String password;
    /**用户电话号码*/
    private String phoneNo;
    /**注册时间*/
    private Date regTime;
    /**注册地址*/
    private String regAddress;
    /**bpc卡号*/
    private String bpcCardNo;
    /**创建时间*/
    private Date createTime;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public String getBpcCardNo() {
        return bpcCardNo;
    }

    public void setBpcCardNo(String bpcCardNo) {
        this.bpcCardNo = bpcCardNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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