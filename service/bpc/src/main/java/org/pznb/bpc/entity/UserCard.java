package org.pznb.bpc.entity;


import lombok.Data;
import org.pznb.bpc.base.BaseEntity;

import java.math.BigDecimal;

/**
 * (TBpcUserCard)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
@Data
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
}