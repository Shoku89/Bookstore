package com.bookstore.infra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String name = "root";
    private static String password = "1234";
    private static String url = "jdbc:mysql://localhost:3306/bookstore";
    private static Connection conn = null;

    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(url, name, password);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return conn;
    }
}
