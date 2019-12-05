package demo1;

import java.util.List;

/**
 * Created by lemon on 2019-12-05 15:20.
 */
public class Dormitory {

    private Integer id;
    private String address;
    /**
     * 几人间
     */
    private String type;
    /**
     * 实际人数
     */
    private Integer actualNum;
    private  Student dorManager;
    private List<Student> list;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Student getDorManager() {
        return dorManager;
    }

    public void setDorManager(Student dorManager) {
        this.dorManager = dorManager;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", actualNum=" + list.size() +
                ", dorManager='" + dorManager + '\'' +
                ", list=" + list +
                '}';
    }
}
