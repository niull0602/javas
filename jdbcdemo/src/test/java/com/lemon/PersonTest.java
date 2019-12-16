package com.lemon;

import com.lemon.bean.Person;
import com.lemon.utils.JdbcUtils;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by lemon on 2019-12-14 23:14.
 */
public class PersonTest {
    @Test
    public void insert() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "INSERT INTO t_person(`username`,sex,IdNo) VALUES('lemon','男','809234582345')";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        if (i==1){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
        JdbcUtils.closeStatement(statement);
        JdbcUtils.closeCon(connection);
    }
    @Test
    public void delete() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "DELETE FROM t_person WHERE id=2";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        if (i==1){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
        JdbcUtils.closeStatement(statement);
        JdbcUtils.closeCon(connection);
    }
    @Test
    public void update() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "UPDATE t_person SET `name`='薛淇' WHERE id=3";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        if (i==1){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }
        JdbcUtils.closeStatement(statement);
        JdbcUtils.closeCon(connection);
    }
    @Test
    public void select() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "SELECT * from t_person";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Person> list = new ArrayList<Person>();
        while (resultSet.next()){
            long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String sex = resultSet.getString("sex");
            int age = resultSet.getInt("age");
            Date birthday = resultSet.getDate("birthday", Calendar.getInstance(Locale.CHINA));
            String address = resultSet.getString("address");
            Person person = new Person(id, name, sex, age, birthday, address);
            list.add(person);
        }
        System.out.println(list);
        JdbcUtils.closeResouce(connection,statement,resultSet);
    }
}
