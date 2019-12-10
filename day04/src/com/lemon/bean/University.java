package com.lemon.bean;

import java.util.Date;

/**
 * Created by lemon on 2019-12-10 10:48.
 */
public class University {
    private Integer id;
    private String name;
    private Date registerDate;
    private String address;

    public University() {
    }

    public University(Integer id, String name, Date registerDate, String address) {
        this.id = id;
        this.name = name;
        this.registerDate = registerDate;
        this.address = address;
    }

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

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registerDate=" + registerDate +
                ", address='" + address + '\'' +
                '}';
    }
}
