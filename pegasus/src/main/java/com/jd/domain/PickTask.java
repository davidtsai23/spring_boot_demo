package com.jd.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 拣选任务
 */
public class PickTask {

    private String pickTaskNo;

    //储位编号
    private List<String> storageCode = new ArrayList<>();

    public List<String> getStorageCode() {
        return storageCode;
    }

    public void setStorageCode(List<String> storageCode) {
        this.storageCode = storageCode;
    }

    public String getPickTaskNo() {
        return pickTaskNo;
    }

    public void setPickTaskNo(String pickTaskNo) {
        this.pickTaskNo = pickTaskNo;
    }

    @Override
    public String toString() {
        return "PickTask{" +
                "pickTaskNo='" + pickTaskNo + '\'' +
                ", storageCode=" + storageCode +
                '}';
    }
}
