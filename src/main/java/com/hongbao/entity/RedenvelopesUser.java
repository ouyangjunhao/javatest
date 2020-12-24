package com.hongbao.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (RedenvelopesUser)实体类
 *
 * @author makejava
 * @since 2020-12-23 09:32:22
 */

@Component
public class RedenvelopesUser implements Serializable {
    private static final long serialVersionUID = 227899237237039556L;
    
    private Integer userid;
    
    private String username;
    
    private String userpwd;
    
    private Double usermoney;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public Double getUsermoney() {
        return usermoney;
    }

    public void setUsermoney(Double usermoney) {
        this.usermoney = usermoney;
    }

}