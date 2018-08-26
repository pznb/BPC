package org.pznb.bpc.entity;

import lombok.Data;
import org.pznb.bpc.base.BaseEntity;

import java.util.Date;

/**
 * (TBpcSiteAdmin)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
@Data
public class SiteAdmin extends BaseEntity {
    private static final long serialVersionUID = -6914383262683588862L;

    /**管理员编号*/
    private String adminNo;
    /**管理员所在网点*/
    private String siteNo;
    /**管理员名字*/
    private String adminName;
    /**管理员电话号码*/
    private String adminPhoneNo;
    /**管理员性别 1、男 2、女*/
    private Integer adminSex;
    /**管理员密码*/
    private String adminPassword;
    /**管理员在职状态*/
    private Integer adminStatus;
    /**admin注册时间*/
    private Date regTime;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;
}