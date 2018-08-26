package org.pznb.bpc.entity;

import lombok.Data;
import org.pznb.bpc.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * (TBpcWithdrewBill)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
@Data
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
}