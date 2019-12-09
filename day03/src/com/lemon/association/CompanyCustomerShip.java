package com.lemon.association;

/**
 * Created by lemon on 2019-12-09 15:47.
 */
public class CompanyCustomerShip {
    private Integer id;
    private Integer companyId;
    private Integer customerId;

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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CompanyCustomerShip{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", customerId=" + customerId +
                '}';
    }
}
