package org.pznb.bpc.entity;

import lombok.Data;
import org.pznb.bpc.base.BaseEntity;

import java.util.Date;

/**
 * (TBpcParkingSite)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
@Data
public class ParkingSite extends BaseEntity {
    private static final long serialVersionUID = -3936134848444938092L;

    /**停车场网点编号*/
    private String siteNo;
    /**省*/
    private String province;
    /**市*/
    private String city;
    /**区*/
    private String area;
    /**街道*/
    private String street;
    /**网点地址*/
    private String siteName;
    /**地址备注*/
    private String note;
    /**停车场网点注册时间*/
    private Date regTime;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;
}