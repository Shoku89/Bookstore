package com.bookstore;

import com.bookstore.infra.DatabaseConnection;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection conn = DatabaseConnection.getConnection();
    }
}
