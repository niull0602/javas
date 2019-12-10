package com.lemon.bean;

/**
 * Created by lemon on 2019-12-10 10:46.
 */
public class Dept {
    private Integer id;
    private String name;
    private String address;
    //哪一个学生会的部室
    private Integer studentUnionId;
    //负责人
    private Student principal;

    public Dept() {
    }

    public Dept(Integer id, String name, String address, Integer studentUnionId, Student principal) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.studentUnionId = studentUnionId;
        this.principal = principal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studentUnionId=" + studentUnionId +
                ", principal=" + principal +
                '}';
    }
}
