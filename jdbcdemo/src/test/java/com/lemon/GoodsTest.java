package com.lemon;

import com.lemon.bean.Goods;
import com.lemon.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemon on 2019-12-15 16:16.
 */
public class GoodsTest {
    @Test
    public void insert() throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        String sql = "INSERT INTO t_goods(`name`,`desc`,price,address) VALUES('iPhone8','外存：64GB','4999.00','美国')";
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
        String sql = "DELETE FROM t_goods WHERE id=2";
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
        String sql = "UPDATE t_goods SET `price`='4399.00' WHERE id=3";
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
        String sql = "SELECT * from t_goods";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Goods> list = new ArrayList<Goods>();
        while (resultSet.next()){
            long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            String desc = resultSet.getString("desc");
            double price = resultSet.getDouble("price");
            String  address = resultSet.getString("address");
            Goods goods = new Goods(id, name, desc, price, address);
            list.add(goods);
        }
        System.out.println(list);
        JdbcUtils.closeResouce(connection,statement,resultSet);
    }
}

