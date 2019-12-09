package com.lemon.bean;

import java.util.Date;

/**
 * Created by lemon on 2019-12-09 14:40.
 */
public class Produce {
    private Integer id;
    private String name;
    private Date productDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    @Override
    public String toString() {
        return "Produce{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productDate=" + productDate +
                '}';
    }
}
