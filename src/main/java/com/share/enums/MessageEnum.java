package com.share.enums;

/**
 * 〈一句话功能简述〉<br>
 * 描述
 *
 * @author yangjians
 * @Date: 2019/1/11 17:05
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum  MessageEnum {
    SYSTEM_ERROR("101","系统异常！"),
    USER_NAME_PASSWORD_ERROR("102","用户名或密码错误！"),
    USER_PASSWORD_ERROR_LIMIT_5 ("103","由于密码输入错误次数大于5次，帐号已经禁止登录！"),
    USER_LIMIT_LOGIN ("104","此帐号已经设置为禁止登录");
    private String code;
    private String message;
    MessageEnum(String code,String message){
        this.code = code;
        this.message = message;
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
     * Gets the value of message. *
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }
}
