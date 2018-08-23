package org.pznb.user.util;

import com.alibaba.fastjson.JSONObject;

/**
 * @version V1.0
 * @author: pengjunjie
 * @date: 2018-08-24 1:31
 */
public class StringUtil {

    public static JSONObject success(Object data, String message) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("data", data);
        jsonObject.put("msg", message);
        return jsonObject;
    }

    public static JSONObject failure(Object data, String message) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 500);
        jsonObject.put("msg", message);
        jsonObject.put("data", data);
        return jsonObject;
    }
}
