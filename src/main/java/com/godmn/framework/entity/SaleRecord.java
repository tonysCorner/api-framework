package com.godmn.framework.entity;


import java.io.Serializable;

public class SaleRecord extends SaleSimpleRecord implements Serializable {

    private String calcCarInfo;

    private String lastYearInsurance;

    private String calcInsurance;

    private Long orderId;

    private String preOrderInfo;

    public SaleRecord() {
    }

    public SaleRecord(SaleRecord record) {
        super(record);
    }

    public String getCalcCarInfo() {
        return calcCarInfo;
    }

    public void setCalcCarInfo(String calcCarInfo) {
        this.calcCarInfo = calcCarInfo;
    }

    public String getLastYearInsurance() {
        return lastYearInsurance;
    }

    public void setLastYearInsurance(String lastYearInsurance) {
        this.lastYearInsurance = lastYearInsurance;
    }

    public String getCalcInsurance() {
        return calcInsurance;
    }

    public void setCalcInsurance(String calcInsurance) {
        this.calcInsurance = calcInsurance;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPreOrderInfo() {
        return preOrderInfo;
    }

    public void setPreOrderInfo(String preOrderInfo) {
        this.preOrderInfo = preOrderInfo;
    }
}
