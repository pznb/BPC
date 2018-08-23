package org.pznb.user.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.pznb.user.entity.UserEntity;
import org.pznb.user.service.UserService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


/**
 * @version V1.0
 * @author: pengjunjie
 * @date: 2018-08-24 1:27
 */
@Slf4j
@RestController
@RequestMapping("/User")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/regUser")
    public JSONObject regUser(@RequestBody UserEntity user) {
        Assert.notNull(user);
        Assert.hasLength(user.getUname());
        Assert.hasLength(user.getPhoneNo());
        Assert.hasLength(user.getRegAddress());
        Assert.hasLength(user.getCarCardNo());
        return userService.regUser(user);
    }

    @RequestMapping("/userListByStatus/{status}")
    public JSONObject regUser(@PathVariable("status") Integer status) {
        return userService.userListByStatus(status);
    }
}
