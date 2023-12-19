/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * insert update delete
 *
 * @author admin
 */
public class UserModify {

    // FILE NÀY THỰC HIỂN KẾT NỐI ĐẾN DATABASE
    public static void insert(Users users) {
        Connection con = null;
        PreparedStatement statement = null;
        try {
            //Mở kết nối đến database
            con = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            // thư viện chuẩn bị kết nối đến database
            // thêm dữ liệu vào database
            String sql = " insert into users(username, email, password) values (?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1, users.getUserName());
            statement.setString(2, users.getEmail());
            statement.setString(3, users.getPassword());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // đóng kết nối đến database
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static List<Users> getUserList() { // lấy danh sách sinh viên
        List<Users> userList = new ArrayList<>();
        Connection con = null;
        PreparedStatement statement = null;
        try {
            //Mở kết nối đến database
            con = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            // thư viện chuẩn bị kết nối đến database
            // thêm dữ liệu vào database
            String sql = "select * from users";
            statement = con.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery(); // lấy ra danh sách sinh viên

            // đọc dữ liệu ra
            while (resultSet.next()) {
                userList.add(new Users( //add sinh vieen vao
                        resultSet.getString("username"), // roi doc tung thang 1
                        resultSet.getString("email"),// roi doc tung thang 1
                        resultSet.getString("password")// roi doc tung thang 1
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // đóng kết nối đến database
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return userList;
    }

    public static void Delete(String username) {
        Connection con = null;
        PreparedStatement statement = null;
        try {
            //Mở kết nối đến database
            con = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            // thư viện chuẩn bị kết nối đến database
            // thêm dữ liệu vào database
            String sql = " delete from users where username = ?";
            statement = con.prepareCall(sql);
            statement.setString(1, username);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // đóng kết nối đến database
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void update(Users users) {
        Connection con = null;
        PreparedStatement statement = null;
        try {
            //Mở kết nối đến database
            con = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            // thư viện chuẩn bị kết nối đến database
            // thêm dữ liệu vào database
            String sql = " update  users set email = ?, password = ? where username= ?";
            statement = con.prepareCall(sql);
            statement.setString(1, users.getEmail());
            statement.setString(2, users.getPassword());
            statement.setString(3, users.getUserName());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // đóng kết nối đến database
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
