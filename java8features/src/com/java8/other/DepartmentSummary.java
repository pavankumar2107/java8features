package com.java8.other;

public class DepartmentSummary {

    private String stationCode;

    private String deptName;

    private Integer sortingOrder;

    public DepartmentSummary(String stationCode, String deptName, Integer sortingOrder) {
        this.stationCode = stationCode;
        this.deptName = deptName;
        this.sortingOrder = sortingOrder;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getSortingOrder() {
        return sortingOrder;
    }

    public void setSortingOrder(Integer sortingOrder) {
        this.sortingOrder = sortingOrder;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    @Override
    public String toString() {
        return "DepartmentSummary{" +
                "stationCode='" + stationCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", sortingOrder=" + sortingOrder +
                '}';
    }


}
