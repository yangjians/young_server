package com.share.shiro.vo;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author huitu123
 * @since 2018-01-23
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uuid;
    private String name;
    private String password;
    private String salt;
    private Integer state;
    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the value of uuid. *
     *
     * @return the value of uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the uuid. *
     * <p>You can use getUuid() to get the value of uuid</p>
     *
     * @param uuid uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /*@Override
    public String toString() {
        return "UserInfo{" +
                "uuid=" + uuid +
                ", name=" + name +
                ", password=" + password +
                ", salt=" + salt +
                ", state=" + state +
                ", username=" + username +
                "}";
    }*/


}
