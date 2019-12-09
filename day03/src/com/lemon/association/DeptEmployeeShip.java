package com.lemon.association;

/**
 * Created by lemon on 2019-12-09 15:44.
 */
public class DeptEmployeeShip {
    private Integer id;
    private Integer deptId;
    private Integer employeeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "DeptEmployeeShip{" +
                "id=" + id +
                ", deptId=" + deptId +
                ", employeeId=" + employeeId +
                '}';
    }
}
