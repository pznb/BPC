package org.pznb.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @version V1.0
 * @package: org.pznb.user.entity
 * @description: 用户实体信息
 * @date: 2018-08-23 1:17
 */
@Data
public class UserEntity implements Serializable{

    private String uid;  //PZ + 9位数字
    private String uname; // 用户名
    private String phoneNo; // 电话号码
    private String regAddress; //注册地址
    private Date regTime; //注册时间
    private String carCardNo; //卡号
    private Integer status; //启用状态
}
