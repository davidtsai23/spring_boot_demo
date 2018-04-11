package com.jd.domain;

import java.io.Serializable;

/**
 * Created by liuxuchao1 on 2017/10/26.
 */
public class BaseRequest implements Serializable {

    /**
     * 防重码
     */
    private String uuid;
    /**
     * 操作人
     */
    private String operatorName;
    /**
     * 机构号
     */
    private String orgNo;

    /**
     * 配送中心号
     */
    private String distributeNo;

    /**
     * 库房号
     */
    private String warehouseNo;

    /**
     * 地图区域编号
     */
    private Long mapAreaId;


    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getDistributeNo() {
        return distributeNo;
    }

    public void setDistributeNo(String distributeNo) {
        this.distributeNo = distributeNo;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Long getMapAreaId() {
        return mapAreaId;
    }

    public void setMapAreaId(Long mapAreaId) {
        this.mapAreaId = mapAreaId;
    }
}
