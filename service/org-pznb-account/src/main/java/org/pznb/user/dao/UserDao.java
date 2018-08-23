package org.pznb.user.dao;

import org.apache.ibatis.annotations.*;
import org.pznb.user.entity.UserEntity;

import java.util.List;

/**
 * @version V1.0
 * @description: 用户dao层
 * @author: pengjunjie
 */
@Mapper
public interface UserDao {

    @Insert("insert into t_user(uid,uname,phone_no,car_card_no,reg_address,reg_time,status) " +
            "values(#{uid},#{uname},#{phoneNo},#{carCardNo},#{regAddress},#{regTime},#{status})")
    int regUser(UserEntity userEntity);

    @Select("select * from t_user where status = #{status}")
    @Results({
            @Result(column = "uid", property = "uid"),
            @Result(column = "uname", property = "uname"),
            @Result(column = "phone_no", property = "phoneNo"),
            @Result(column = "reg_address", property = "regAddress"),
            @Result(column = "reg_time", property = "regTime"),
            @Result(column = "car_card_no", property = "carCardNo"),
            @Result(column = "status", property = "status")
    })
    List<UserEntity> userListByStatus(Integer status);
}
