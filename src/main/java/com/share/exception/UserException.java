package com.share.exception;

import com.share.enums.MessageEnum;

import javax.naming.AuthenticationException;

/**
 * 〈一句话功能简述〉<br>
 * 描述
 *
 * @author yangjians
 * @Date: 2019/1/11 17:11
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class UserException extends RuntimeException {
    private String code;
    public UserException(MessageEnum messageEnum){
        super(messageEnum.getMessage());
        this.code = messageEnum.getCode();
    }

    /**
     * Gets the value of code. *
     *
     * @return the value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code. *
     * <p>You can use getCode() to get the value of code</p>
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
