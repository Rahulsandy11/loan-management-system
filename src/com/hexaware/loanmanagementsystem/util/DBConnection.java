package com.hexaware.loanmanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            // Register MySQL JDBC Driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            
            // Establish connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3389/bank", "root", "admin1234");
            

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}