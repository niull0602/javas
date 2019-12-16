package com.lemon.utils;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * Created by lemon on 2019-12-14 23:16.
 */
public class JdbcUtils {
    static final String URL;
    static final String USER;
    static final String PASSWORD;
    static final String DRIVERCLASS;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        DRIVERCLASS=bundle.getString("diverClass");
        URL=bundle.getString("url");
        PASSWORD=bundle.getString("password");
        USER=bundle.getString("user");
    }

    static {
        try {
            Class.forName(DRIVERCLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //拿到链接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    //关闭连接关闭执行  关闭结果集

    public  static  void closeResouce(Connection connection, Statement statement , ResultSet resultSet){
        closeRestSet(resultSet);
        closeStatement(statement);
        closeCon(connection);

    }

    public  static void closeCon(Connection connection)  {
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection=null;
        }
    }

    public static  void  closeStatement(Statement statement){
        if (statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            statement=null;
        }
    }

    public static void closeRestSet(ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs=null;
        }
    }
}
