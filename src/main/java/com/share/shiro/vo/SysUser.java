package com.share.shiro.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/10.
 */
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;
    private String status;

    /**
     * Gets the value of status. *
     *
     * @return the value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status. *
     * <p>You can use getStatus() to get the value of status</p>
     *
     * @param status status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "UserInfo{" +
                "password=" + password +
                ", status=" + status +
                ", username=" + username +
                "}";
    }
}
