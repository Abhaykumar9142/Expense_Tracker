package com.Abhay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    Connection conn=null;
    int row=0;
    PreparedStatement pstmt=null;
    User user=new User();
    public int register(User user){

        try {
            conn=jdbcUtil.getConnection();
            String sql="INSERT INTO users(name,email,password) values(?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,user.getName());
            pstmt.setString(2,user.getEmail());
            pstmt.setString(3,user.getPassword());
            row=pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                jdbcUtil.closeConnection(conn,pstmt);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

return row;
    }
}
