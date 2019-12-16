package com.lemon;

import com.lemon.bean.Animal;
import com.lemon.utils.JdbcUtils;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemon on 2019-12-15 15:47.
 */
public class AnimalTest {
    @Test
    public void insert() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "INSERT INTO t_animal(`name`,sex,age,person_id) VALUES('鹦鹉','公','1','3')";
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
        String sql = "DELETE FROM t_animal WHERE id=2";
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
        String sql = "UPDATE t_animal SET `sex`='母' WHERE id=3";
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
        String sql = "SELECT * from t_animal";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Animal> list = new ArrayList<Animal>();
        while (resultSet.next()){
            long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String sex = resultSet.getString("sex");
            int age = resultSet.getInt("age");
            long person_id = resultSet.getLong("person_id");
            Animal animal = new Animal(id, name, sex, age, person_id);
            list.add(animal);
        }
        System.out.println(list);
        JdbcUtils.closeResouce(connection,statement,resultSet);
    }
}

