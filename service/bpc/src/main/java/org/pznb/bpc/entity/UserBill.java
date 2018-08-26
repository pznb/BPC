package org.pznb.bpc.entity;

import lombok.Data;
import org.pznb.bpc.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * (TBpcUserBill)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
@Data
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
}