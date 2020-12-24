package com.hongbao.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * (Redenvelopes)实体类
 *
 * @author makejava
 * @since 2020-12-23 09:32:18
 */

@Component
public class Redenvelopes implements Serializable {
    private static final long serialVersionUID = -67178808712116334L;
    
    private Integer redenvelopesid;
    
    private Double money;
    
    private Integer count;
    
    private String createtime;
    
    private Integer lifecycle;


    public Integer getRedenvelopesid() {
        return redenvelopesid;
    }

    public void setRedenvelopesid(Integer redenvelopesid) {
        this.redenvelopesid = redenvelopesid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(Integer lifecycle) {
        this.lifecycle = lifecycle;
    }

}