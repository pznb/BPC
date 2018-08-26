package org.pznb.bpc.entity;


import org.pznb.bpc.base.BaseEntity;

import java.math.BigDecimal;

/**
 * (TBpcUserCard)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
public class UserCard extends BaseEntity {
    private static final long serialVersionUID = -1347522887400170391L;

    /**卡号*/
    private String bpcCardNo;
    /**持卡人*/
    private String phoneNo;
    /**卡变归属地址*/
    private String siteNo;
    /**卡片状态*/
    private Integer cardStatus;
    /**卡片现有金额*/
    private BigDecimal cardBalance;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;


    public String getBpcCardNo() {
        return bpcCardNo;
    }

    public void setBpcCardNo(String bpcCardNo) {
        this.bpcCardNo = bpcCardNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(String siteNo) {
        this.siteNo = siteNo;
    }

    public Integer getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
    }

    public BigDecimal getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(BigDecimal cardBalance) {
        this.cardBalance = cardBalance;
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