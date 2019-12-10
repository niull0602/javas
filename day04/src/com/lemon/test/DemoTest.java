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
        while (i<4) {
                writeWeekResport.setId(i);
                writeWeekResport.setFilePath("C:\\Users\\Administrator\\Desktop\\test\\" + student1.getName()+i+".txt");
                writeWeekResport.setMemberId(student1.getId());
                writeWeekResport.setPresidentId(president.getId());
                writeWeekResport.setContent(student1.getName()+",今天我完成了任务" + new Date());
                writeWeekResport.writeWeekResport();
                Thread.sleep(100);
                writeWeekResport.setId(i);
                writeWeekResport.setFilePath("C:\\Users\\Administrator\\Desktop\\test\\" + student2.getName()+i+".txt");
                writeWeekResport.setMemberId(student1.getId());
                writeWeekResport.setPresidentId(president.getId());
                writeWeekResport.setContent(student2.getName()+",今天我完成了任务" + new Date());
                writeWeekResport.writeWeekResport();
                Thread.sleep(100);
            i++;
        }
        Thread.sleep(100);
        for (int j = 0; j < 4; j++) {
            writeWeekResport.readWeekResport(student1,j);
            Thread.sleep(100);
            writeWeekResport.readWeekResport(student2,j);
            Thread.sleep(100);
        }

    }
}
