package com.yoxiang.multi_thread_programming.chapter06.sample08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author: Rivers
 * Date: 2018/1/10 20:56
 */
public class MyObject {

    public enum MyEnumSingleton {
        connectionFactory;

        private Connection connection;

        private MyEnumSingleton() {
            try {
                System.out.println("MyObject init");
                String url = "jdbc:sqlserver://localhost:1079;databaseName=test";
                String username = "sa";
                String password = "";
                String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}
