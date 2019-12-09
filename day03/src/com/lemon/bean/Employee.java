package com.lemon.bean;

import java.util.Date;

/**
 * Created by lemon on 2019-12-09 14:44.
 */
public class Employee {
    private Integer id;
    private String name;
    private String job;
    //上级
    private Integer mgrId;
    //入职时间
    private Date hiredate;
}
