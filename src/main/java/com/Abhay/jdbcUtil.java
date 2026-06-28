package com.Abhay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUtil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Driver is registered Successfully");
    }

    public static Connection getConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/expense";
        String username="root";
        String password="****";
return DriverManager.getConnection(url,username,password);
    }

    public static void closeConnection(Connection conn, Statement stmt) throws SQLException {
if(stmt!=null)stmt.close();
if(conn!=null)conn.close();
    }

}
