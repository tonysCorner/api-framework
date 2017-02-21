package com.godmn.framework.entity;


import java.util.Date;

public class SaleUrl {

    private Long urlId;

    private Long saleId;

    private String topicUrl;

    private Integer batchId;

    private String batchUrl;

    private String batchShortUrl;

    private Byte status;

    private int customerNum;

    private int calcNum;

    private int orderNum;

    private int BatchNum;

    private Date updateTime;

    private Date createTime;

    public Long getUrlId() {
        return urlId;
    }

    public void setUrlId(Long urlId) {
        this.urlId = urlId;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public String getTopicUrl() {
        return topicUrl;
    }

    public void setTopicUrl(String topicUrl) {
        this.topicUrl = topicUrl;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchUrl() {
        return batchUrl;
    }

    public void setBatchUrl(String batchUrl) {
        this.batchUrl = batchUrl;
    }

    public String getBatchShortUrl() {
        return batchShortUrl;
    }

    public void setBatchShortUrl(String batchShortUrl) {
        this.batchShortUrl = batchShortUrl;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public int getCalcNum() {
        return calcNum;
    }

    public void setCalcNum(int calcNum) {
        this.calcNum = calcNum;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getBatchNum() {
        return BatchNum;
    }

    public void setBatchNum(int batchNum) {
        BatchNum = batchNum;
    }
}
