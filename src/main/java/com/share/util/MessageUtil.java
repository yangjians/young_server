package com.share.util;

import com.share.common.vo.Result;

/**
 * 〈一句话功能简述〉<br>
 * 描述
 *
 * @author yangjians
 * @Date: 2019/1/11 17:01
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MessageUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode("200");
        result.setMessage("SUCCESS");
        if(object!=null){
            result.setData(object);
        }
        return result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result error(String code,String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
