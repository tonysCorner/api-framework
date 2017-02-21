package com.godmn.framework.entity;


import java.io.Serializable;
import java.util.Date;

public class SaleSimpleRecord implements Serializable {

    private Long recordId;

    private Long saleId;

    private Long cid;

    private Long carId;

    private Long calcId;

    private Integer batchId;

    private Integer cityId;

    private String plateNumber;

    private String carOwner;

    private String vin;

    private String engineNo;

    private Date registerDate;

    private Integer status;

    private String desc;

    private Date forceBeginTime;

    private Date businessBeginTime;

    private Date insuranceExpireDate;

    private Integer amount;

    private Integer realAmount;

    private Integer bjmpAmount;

    private Integer saveAmount;

    private Float lastYearClaimCount;

    private Integer lastYearIllegalCount;

    private String carModel;

    private Date updateTime;

    private Date createTime;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCalcId() {
        return calcId;
    }

    public void setCalcId(Long calcId) {
        this.calcId = calcId;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getForceBeginTime() {
        return forceBeginTime;
    }

    public void setForceBeginTime(Date forceBeginTime) {
        this.forceBeginTime = forceBeginTime;
    }

    public Date getBusinessBeginTime() {
        return businessBeginTime;
    }

    public void setBusinessBeginTime(Date businessBeginTime) {
        this.businessBeginTime = businessBeginTime;
    }

    public Date getInsuranceExpireDate() {
        return insuranceExpireDate;
    }

    public void setInsuranceExpireDate(Date insuranceExpireDate) {
        this.insuranceExpireDate = insuranceExpireDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Integer realAmount) {
        this.realAmount = realAmount;
    }

    public Float getLastYearClaimCount() {
        return lastYearClaimCount;
    }

    public void setLastYearClaimCount(Float lastYearClaimCount) {
        this.lastYearClaimCount = lastYearClaimCount;
    }

    public Integer getLastYearIllegalCount() {
        return lastYearIllegalCount;
    }

    public void setLastYearIllegalCount(Integer lastYearIllegalCount) {
        this.lastYearIllegalCount = lastYearIllegalCount;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
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

    public Integer getBjmpAmount() {
        return bjmpAmount;
    }

    public void setBjmpAmount(Integer bjmpAmount) {
        this.bjmpAmount = bjmpAmount;
    }

    public Integer getSaveAmount() {
        return saveAmount;
    }

    public void setSaveAmount(Integer saveAmount) {
        this.saveAmount = saveAmount;
    }

    public SaleSimpleRecord() {
    }

    public SaleSimpleRecord(SaleRecord record) {
        this.setRecordId(record.getRecordId());
        this.setPlateNumber(record.getPlateNumber());
        this.setCarModel(record.getCarModel());
        this.setInsuranceExpireDate(record.getInsuranceExpireDate());
        this.setLastYearClaimCount(record.getLastYearClaimCount());
        this.setAmount(record.getAmount());
        this.setRealAmount(record.getRealAmount());
        this.setCarId(record.getCarId());

    }
}
