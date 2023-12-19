/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import config.Config;
import config.Close;
import entity.Customer;
import entity.User;


/**
 *
 * @author DELL
 */
public class CustomerManagement {

    private Connection conn = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;

    public static List<Customer> getCustomerList() {
        Connection conn = null ;
        PreparedStatement preparedStatement = null ;
        ResultSet rs = null ;
        List<Customer> customerList = new ArrayList<>();

        String sql = "SELECT*FROM customer";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", Config.USERNAME, Config.PASSWORD);
            preparedStatement = conn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Customer customerMn = new Customer(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("phone"),
                        rs.getString("birthday"),
                        rs.getString("created_at"),
                        rs.getString("updated_at"),
                        rs.getInt("staff_id")
                );

                customerList.add(customerMn);
            }

        } catch (SQLException e) {
        } finally {
            Close.closeConnection(conn);
            Close.closeResultSet(rs);
            Close.closePreparedStatement(preparedStatement);

        }
        return customerList;

    }

    public boolean add(Customer customerMn) {
        boolean flag = false;
        String sql = "INSERT INTO customer(id, name, age, gender, phone,birthday,created_at,updated_at, staff_id)VALUES(?,?,?,?,?,?,?,?,?)";
        try {

            conn = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, customerMn.getId());
            preparedStatement.setString(2, customerMn.getName());
            preparedStatement.setInt(3, customerMn.getAge());
            preparedStatement.setInt(4, customerMn.getStaff_id());
            preparedStatement.setString(5, customerMn.getGender());
            preparedStatement.setString(6, customerMn.getPhone());
            preparedStatement.setString(7, customerMn.getBirthday());
            preparedStatement.setString(8, customerMn.getCreated_at());
            preparedStatement.setString(9, customerMn.getUpdated_at());

            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("aaaa");
                flag = true;
            }

        } catch (SQLException e) {
        } finally {
            Close.closeConnection(conn);
            Close.closePreparedStatement(preparedStatement);

        }
        return false;

    }

    public static void update(User customerMn) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", Config.USERNAME, Config.PASSWORD);
            String sql = "UPDATE customer set name = ? ,age = ? ,gender = ? ,"
                    + "phone = ? ,birthday = ? ,created_at = ? ,updated_at = ? where id = ?";
            preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, customerMn.getId());
            preparedStatement.setString(2, customerMn.getName());
            preparedStatement.setInt(3, customerMn.getAge());
            preparedStatement.setInt(4, customerMn.getStaff_id());
            preparedStatement.setString(5, customerMn.getGender());
            preparedStatement.setString(6, customerMn.getPhone());
            preparedStatement.setString(7, customerMn.getBirthday());
            preparedStatement.setString(8, customerMn.getCreated_at());
            preparedStatement.setString(9, customerMn.getUpdated_at());
            preparedStatement.execute();

        } catch (SQLException e) {
        } finally {
            Close.closeConnection(conn);
            Close.closePreparedStatement(preparedStatement);

        }

    }

    public static void delete(int id) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", Config.USERNAME, Config.PASSWORD);
            String sql = "DELETE from customer where id= ?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Close.closeConnection(conn);
            Close.closePreparedStatement(preparedStatement);
            Close.closeResultSet(rs);
        }

    }

}
