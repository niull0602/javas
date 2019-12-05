package demo2;

import java.util.Date;

/**
 * Created by lemon on 2019-12-15 16:51.
 */
public class Person {
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
