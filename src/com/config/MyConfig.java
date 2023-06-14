package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyConfig {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_sisfo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    protected static Connection connect;
    protected static PreparedStatement statement;
    protected static ResultSet resultSet;
    protected static String query;

    public static void connection(){
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Data Base Sukses");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
