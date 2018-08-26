package org.pznb.bpc.entity;

import org.pznb.bpc.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * (TBpcUserBill)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
public class UserBill extends BaseEntity {
    private static final long serialVersionUID = -6698074656004288616L;

    /**帐单号*/
    private String billNo;
    /**消费者手机号*/
    private String phoneNo;
    
    private String bpcNo;
    /**消费网点编号*/
    private String siteNo;
    /**消费前额度*/
    private BigDecimal bpcBalance;
    /**消费额度*/
    private BigDecimal consumeBalance;
    /**消费后实际剩余额度*/
    private BigDecimal factBalance;
    /**消费时间*/
    private Date consumeTime;
    /**操作标识1、充值 2、扣费*/
    private Integer operation;
    /**消费状态、1、提交订单 2、处理中 3、处理成功 4、支付失败*/
    private Integer status;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;


    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBpcNo() {
        return bpcNo;
    }

    public void setBpcNo(String bpcNo) {
        this.bpcNo = bpcNo;
    }

    public String getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(String siteNo) {
        this.siteNo = siteNo;
    }

    public BigDecimal getBpcBalance() {
        return bpcBalance;
    }

    public void setBpcBalance(BigDecimal bpcBalance) {
        this.bpcBalance = bpcBalance;
    }

    public BigDecimal getConsumeBalance() {
        return consumeBalance;
    }

    public void setConsumeBalance(BigDecimal consumeBalance) {
        this.consumeBalance = consumeBalance;
    }

    public BigDecimal getFactBalance() {
        return factBalance;
    }

    public void setFactBalance(BigDecimal factBalance) {
        this.factBalance = factBalance;
    }

    public Date getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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