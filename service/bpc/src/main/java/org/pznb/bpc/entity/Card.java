package org.pznb.bpc.entity;

import lombok.Data;
import org.pznb.bpc.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * (TBpcCard)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
@Data
public class Card extends BaseEntity {
    private static final long serialVersionUID = -1683722852502696051L;

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
}