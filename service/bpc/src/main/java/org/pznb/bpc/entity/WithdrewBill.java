package org.pznb.bpc.entity;

import org.pznb.bpc.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * (TBpcWithdrewBill)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
public class WithdrewBill extends BaseEntity {
    private static final long serialVersionUID = -8935417709346082888L;

    /**网点提现账单记录*/
    private String siteBillNo;
    
    private String siteNo;
    /**只有操作人可以提现*/
    private String adminNo;
    /**提现时间*/
    private Date withdrewTime;
    /**提现金额*/
    private BigDecimal withdrewBalance;
    /**今日最大提现次数*/
    private Object withdrewNum;
    /**提现状态 1、提交订单 2、处理中 3、支付成功 4 、失败*/
    private Integer status;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;


    public String getSiteBillNo() {
        return siteBillNo;
    }

    public void setSiteBillNo(String siteBillNo) {
        this.siteBillNo = siteBillNo;
    }

    public String getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(String siteNo) {
        this.siteNo = siteNo;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    public Date getWithdrewTime() {
        return withdrewTime;
    }

    public void setWithdrewTime(Date withdrewTime) {
        this.withdrewTime = withdrewTime;
    }

    public BigDecimal getWithdrewBalance() {
        return withdrewBalance;
    }

    public void setWithdrewBalance(BigDecimal withdrewBalance) {
        this.withdrewBalance = withdrewBalance;
    }

    public Object getWithdrewNum() {
        return withdrewNum;
    }

    public void setWithdrewNum(Object withdrewNum) {
        this.withdrewNum = withdrewNum;
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