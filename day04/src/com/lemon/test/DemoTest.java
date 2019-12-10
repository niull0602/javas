package com.lemon.test;

import com.lemon.bean.Student;
import com.lemon.bean.WriteWeekResport;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lemon on 2019-12-10 11:01.
 */
public class DemoTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        Calendar instance = Calendar.getInstance();
        instance.set(1997,2,12);
        Student president = new Student(1,"路路通","男", instance.getTime());
        instance.set(1998,7,26);
        Student student1 = new Student(2, "小男孩", "男", instance.getTime());
        instance.set(1998,1,16);
        Student student2 = new Student(3, "小女孩", "女", instance.getTime());
        WriteWeekResport writeWeekResport = new WriteWeekResport();
        int i=0;
        while (true) {
            if (i % 2 == 0) {
                writeWeekResport.setId(i);
                writeWeekResport.setFilePath("C:\\Users\\Administrator\\Desktop\\test\\" + new Date().getTime()+".txt");
                writeWeekResport.setMemberId(student1.getId());
                writeWeekResport.setPresidentId(president.getId());
                writeWeekResport.setContent(student1.getName()+"今天我完成了任务" + new Date());
                writeWeekResport.writeWeekResport();
                Thread.sleep(10);
            }else {
                writeWeekResport.setId(i);
                writeWeekResport.setFilePath("C:\\Users\\Administrator\\Desktop\\test\\" + new Date().getTime()+".txt");
                writeWeekResport.setMemberId(student1.getId());
                writeWeekResport.setPresidentId(president.getId());
                writeWeekResport.setContent(student2.getName()+"今天我完成了任务" + new Date());
                writeWeekResport.writeWeekResport();
                Thread.sleep(10);
            }
            i++;
        }
    }
}
