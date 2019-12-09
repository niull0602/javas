package com.lemon.association;

/**
 * Created by lemon on 2019-12-09 15:49.
 */
public class CompanyProduceShip {
    private Integer id;
    private Integer companyId;
    private Integer produceId;

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

    public Integer getProduceId() {
        return produceId;
    }

    public void setProduceId(Integer produceId) {
        this.produceId = produceId;
    }

    @Override
    public String toString() {
        return "CompanyProduceShip{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", produceId=" + produceId +
                '}';
    }
}
