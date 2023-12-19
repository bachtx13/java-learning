/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import account.AccountForm;
import config.Config;
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
 *
 * @author admin
 */
public class JDBCConnect {
    public static List<AccountForm> getAccountList() { 
        List<AccountForm> AccountList = new ArrayList<>();
        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            String sql = "select * from account where ";
            statement = con.prepareCall(sql);

            ResultSet resultSet = statement.executeQuery(); 
            while (resultSet.next()) {
                AccountList.add(new AccountForm( 
                        resultSet.getString("userName"),
                        resultSet.getString("password")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return AccountList;
    }
    
      public static void insert(AccountForm accountForm) {
         
        Connection con = null;
        PreparedStatement statement = null;
        try {
            //Mở kết nối đến database
            con = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            // thư viện chuẩn bị kết nối đến database
            // thêm dữ liệu vào database
            String sql = "insert into account(userName, password) values (?,?)";
            statement = con.prepareStatement(sql);
            statement.setString(1, accountForm.getUserName());
            statement.setString(2, accountForm.getPassword());
            ResultSet rs = statement.executeQuery();
            
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // đóng kết nối đến database
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
      
    
}
