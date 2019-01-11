package com.share.common.vo;

/**
 * 〈一句话功能简述〉<br>
 * 描述
 *
 * @author yangjians
 * @Date: 2019/1/11 16:59
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Result<T> {
    //状态码
    private String code;
    //消息
    private String message;
    //数据
    private T data;

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

    /**
     * Gets the value of message. *
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message. *
     * <p>You can use getMessage() to get the value of message</p>
     *
     * @param message message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the value of data. *
     *
     * @return the value of data
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the data. *
     * <p>You can use getData() to get the value of data</p>
     *
     * @param data data
     */
    public void setData(T data) {
        this.data = data;
    }
}
