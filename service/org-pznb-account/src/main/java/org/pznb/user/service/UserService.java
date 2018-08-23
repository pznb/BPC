package org.pznb.user.service;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.pznb.user.dao.UserDao;
import org.pznb.user.entity.UserEntity;
import org.pznb.user.util.StringUtil;
import org.pznb.user.util.UserException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @version V1.0
 * @author: pengjunjie
 * @date: 2018-08-24 1:41
 */
@Slf4j
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public JSONObject regUser(UserEntity user) {
        try {
            user.setUid(UUID.randomUUID().toString());
            user.setRegTime(new Date());
            user.setStatus(0);
            userDao.regUser(user);
        } catch (Exception ex) {
            log.error("用户注册失败");
            throw new UserException("用户注册失败");
        }

        return StringUtil.success(null, "新增用户成功");
    }

    public JSONObject userListByStatus(Integer status) {
        List<UserEntity> userList = userDao.userListByStatus(status);
        return StringUtil.success(userList, "用户列表查询成功");
    }
}
