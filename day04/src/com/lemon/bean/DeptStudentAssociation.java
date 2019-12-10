package com.lemon.bean;

/**
 * Created by lemon on 2019-12-10 11:00.
 */
public class DeptStudentAssociation {
    private Integer id;
    private Integer deptId;
    private Integer studentId;

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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "DeptStudentAssociation{" +
                "id=" + id +
                ", deptId=" + deptId +
                ", studentId=" + studentId +
                '}';
    }
}
