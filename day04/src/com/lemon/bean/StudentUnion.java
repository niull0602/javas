package com.lemon.bean;

/**
 * Created by lemon on 2019-12-10 10:48.
 */
public class StudentUnion {
    private Integer id;
    private String name;
    //类型
    private String type;
    private Integer universityId;

    public StudentUnion() {
    }

    public StudentUnion(Integer id, String name, String type, Integer universityId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.universityId = universityId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    @Override
    public String toString() {
        return "StudentUnion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", universityId=" + universityId +
                '}';
    }
}
