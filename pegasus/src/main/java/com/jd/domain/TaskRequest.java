package com.jd.domain;


import java.util.List;

public class TaskRequest extends BaseRequest{

    private String taskNo;
    private String carNo;
    private String startPosition;
    private String endPosition;
    private String priority;
    private String containerNo;
    private String taskSource;
    private String recheckVirtualPoint;     //复核虚拟点
    private List<PickPoint> pickPointList;  //拣选点


    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(String startPosition) {
        this.startPosition = startPosition;
    }

    public String getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(String endPosition) {
        this.endPosition = endPosition;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public String getTaskSource() {
        return taskSource;
    }

    public void setTaskSource(String taskSource) {
        this.taskSource = taskSource;
    }

    public String getRecheckVirtualPoint() {
        return recheckVirtualPoint;
    }

    public void setRecheckVirtualPoint(String recheckVirtualPoint) {
        this.recheckVirtualPoint = recheckVirtualPoint;
    }

    public List<PickPoint> getPickPointList() {
        return pickPointList;
    }

    public void setPickPointList(List<PickPoint> pickPointList) {
        this.pickPointList = pickPointList;
    }

    @Override
    public String toString() {
        return "TaskRequest{" +
                "taskNo='" + taskNo + '\'' +
                ", carNo='" + carNo + '\'' +
                ", startPosition='" + startPosition + '\'' +
                ", endPosition='" + endPosition + '\'' +
                ", priority='" + priority + '\'' +
                ", containerNo='" + containerNo + '\'' +
                ", taskSource='" + taskSource + '\'' +
                ", recheckVirtualPoint='" + recheckVirtualPoint + '\'' +
                ", pickPointList=" + pickPointList +
                '}';
    }
}
