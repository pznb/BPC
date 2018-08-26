package org.pznb.bpc.entity;

import lombok.Data;
import org.pznb.bpc.base.BaseEntity;

import java.util.Date;

/**
 * (TBpcUser)表实体类
 *
 * @author PJJ
 * @since 2018/08/26
 */
@Data
public class User extends BaseEntity {
    private static final long serialVersionUID = 701638677479955536L;

    /**用户名*/
    private String username;
    /**用户密码*/
    private String password;
    /**用户电话号码*/
    private String phoneNo;
    /**注册时间*/
    private Date regTime;
    /**注册地址*/
    private String regAddress;
    /**bpc卡号*/
    private String bpcCardNo;
    /**创建时间*/
    private Date createTime;
    
    private String spare1;
    
    private String spare2;
    
    private String spare3;
}