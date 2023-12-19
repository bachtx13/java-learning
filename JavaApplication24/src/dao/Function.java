/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Close;
import config.Config;
import entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Function {

    private Connection conn = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;

    public void changePass(String email, String password) {
        try {
            String query = "UPDATE user set password = ? where email = ?";
            conn = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

        } catch (SQLException e) {
        } finally {
            Close.closeConnection(conn);
            Close.closePreparedStatement(preparedStatement);
            Close.closeResultSet(rs);
        }
    }

    public static List<User> search(String name) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<User> usersList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM user where name like  '%" + name + "%'";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", Config.USERNAME, Config.PASSWORD);
            preparedStatement = conn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                User std = new User(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("dob"),
                        rs.getString("password"),
                        rs.getString("address"),
                        rs.getString("position"),
                        rs.getString("salary"),
                        rs.getString("created_at"),
                        rs.getString("updated_at"),
                        rs.getInt("role_id")
                );
                usersList.add(std);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Close.closeConnection(conn);
            Close.closePreparedStatement(preparedStatement);
            Close.closeResultSet(rs);
        }
        return usersList;
    }
}
