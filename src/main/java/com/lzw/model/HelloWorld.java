package com.lzw.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by LZW on 2017/12/12.
 */

public class HelloWorld implements Serializable {

    private Integer id;
    private Date CreateTime;
    private String remark;
    private String ipLongitudeAndLatitude;
    private String ipAddress;
    private String llqLongitudeAndLatitude;
    private String llqAddress;
    private String sdkLongitudeAndLatitude;
    private String sdkAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIpLongitudeAndLatitude() {
        return ipLongitudeAndLatitude;
    }

    public void setIpLongitudeAndLatitude(String ipLongitudeAndLatitude) {
        this.ipLongitudeAndLatitude = ipLongitudeAndLatitude;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLlqLongitudeAndLatitude() {
        return llqLongitudeAndLatitude;
    }

    public void setLlqLongitudeAndLatitude(String llqLongitudeAndLatitude) {
        this.llqLongitudeAndLatitude = llqLongitudeAndLatitude;
    }

    public String getLlqAddress() {
        return llqAddress;
    }

    public void setLlqAddress(String llqAddress) {
        this.llqAddress = llqAddress;
    }

    public String getSdkLongitudeAndLatitude() {
        return sdkLongitudeAndLatitude;
    }

    public void setSdkLongitudeAndLatitude(String sdkLongitudeAndLatitude) {
        this.sdkLongitudeAndLatitude = sdkLongitudeAndLatitude;
    }

    public String getSdkAddress() {
        return sdkAddress;
    }

    public void setSdkAddress(String sdkAddress) {
        this.sdkAddress = sdkAddress;
    }
}
