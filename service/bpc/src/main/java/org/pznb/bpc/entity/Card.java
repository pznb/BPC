package org.pznb.bpc.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * (TBpcCard)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
public class Card {
    /**卡号*/
    private String bpcCardNo;
    /**卡类型 1、储值卡*/
    private Integer cardType;
    /**卡状态 1、正常*/
    private Integer cardStatus;
    /**卡成本*/
    private BigDecimal cost;
    /**生产商*/
    private String producer;
    /**卡的分配状态 1、未分配 2、已分配*/
    private Integer assignStatus;
    /**分配的停车场网点地址编号*/
    private String assigNo;
    /**卡片售出时间*/
    private Date saleTime;
    /**售出状态 1、未售出 2、已售出*/
    private Integer saleStatus;
    /**售出地址编号*/
    private String saleNo;
    /**卡片归属者*/
    private String phoneNo;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;


    public String getBpcCardNo() {
        return bpcCardNo;
    }

    public void setBpcCardNo(String bpcCardNo) {
        this.bpcCardNo = bpcCardNo;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Integer getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getAssignStatus() {
        return assignStatus;
    }

    public void setAssignStatus(Integer assignStatus) {
        this.assignStatus = assignStatus;
    }

    public String getAssigNo() {
        return assigNo;
    }

    public void setAssigNo(String assigNo) {
        this.assigNo = assigNo;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
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