package com.lemon.bean;

/**
 * Created by lemon on 2019-12-14 23:06.
 */
public class Animal {
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    private Long personId;

    public Animal() {
    }

    public Animal(Long id, String name, String sex, Integer age, Long personId) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.personId = personId;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", personId=" + personId +
                '}';
    }
}
