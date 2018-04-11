package com.jd.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 拣选点
 */
public class PickPoint {

    private String pointNo;

    public String getPointNo() {
        return pointNo;
    }

    public void setPointNo(String pointNo) {
        this.pointNo = pointNo;
    }

    //拣选任务
    private List<PickTask> pickTaskList = new ArrayList<>();

    public List<PickTask> getPickTaskList() {
        return pickTaskList;
    }

    public void setPickTaskList(List<PickTask> pickTaskList) {
        this.pickTaskList = pickTaskList;
    }

    @Override
    public String toString() {
        return "PickPoint{" +
                "pickTaskList=" + pickTaskList +
                '}';
    }
}
