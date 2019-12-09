package com.lemon.association;

/**
 * Created by lemon on 2019-12-09 15:26.
 */
public class CompanyDeptShip {
    private Integer id;
    private Integer companyId;
    private Integer deptId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "CompanyDeptShip{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", deptId=" + deptId +
                '}';
    }
}
