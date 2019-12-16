package com.lemon.bean;

/**
 * Created by lemon on 2019-12-14 23:12.
 */
public class Goods {
    private Long id;
    private String name;
    private String desc;
    private Double price;
    private String address;

    public Goods() {
    }

    public Goods(Long id, String name, String desc, Double price, String address) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }
}
