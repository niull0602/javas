package demo1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by lemon on 2019-12-05 15:36.
 */
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(1,"老薛","男",new Date());
        Student student2 = new Student(2,"小王","男",new Date());
        Student student3 = new Student(3,"小罗","男",new Date());
        Student student4 = new Student(4,"tony","男",new Date());
        Student student5 = new Student(5,"tom","男",new Date());
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        Dormitory dormitory = new Dormitory();
        dormitory.setId(1);
        dormitory.setType("六人间");
        dormitory.setAddress("13#1519");
        dormitory.setDorManager("袁大头");
        dormitory.setList(list);
        System.out.println(dormitory);
    }
}
