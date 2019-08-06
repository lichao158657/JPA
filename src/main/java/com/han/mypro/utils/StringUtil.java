package com.han.mypro.utils;

import com.alibaba.fastjson.JSON;

public class StringUtil {

    private static StringUtil stringUtil;

    private StringUtil(){}

    public static StringUtil getStringUtil(){
        if (stringUtil == null){
            stringUtil = new StringUtil();
        }
        return stringUtil;
    }

    /**
     * 将对象json化
     */

    public String toJson(Object obj){

        if(obj == null){
            return null;
        }
        /* java对象转为json */

        String jsonStr = JSON.toJSONString(obj);
        return jsonStr;
    }
}
