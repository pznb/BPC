package org.pznb.bpc.util;

import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author: PJJ
 * @date: 2018/8/26
 */
public class ResultUtil {

    /**
     * 公共返回结果集、成功
     *
     * @param data
     * @param msg
     * @return JSONObject
     */
    public static JSONObject success(Object data, String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", 200);
        jsonObject.put("msg", msg);
        jsonObject.put("data", data);
        return jsonObject;
    }

    /**
     * 公共结果返回集、失败
     *
     * @param data
     * @param msg
     * @return JSONObject
     */
    public static JSONObject failure(Object data, String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", 500);
        jsonObject.put("msg", msg);
        jsonObject.put("data", data);
        return jsonObject;
    }
}
