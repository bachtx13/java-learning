/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.IDBConfig;
//import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class JDBCConect {
    public static Connection getJDBCConnection(){
        Connection con = null;
        String connectionUrl = "jdbc:mysql://"+ IDBConfig.HOSTNAME
                + ":" + IDBConfig.PORT + "/" + IDBConfig.DBNAME;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Where is your mysql jdbc driver?");
            return con;
        }
        System.out.println("MySQL JDBC Driver Registered");
        try {
            con = DriverManager.getConnection(connectionUrl, IDBConfig.USERNAME, IDBConfig.PASSWORD);
        } catch (SQLException ex) {
            System.err.println("Connection Failed! check output c onsole");
            return con;
        }
        return con;
        
    }
    public static void main(String[] args) {
        System.out.println(getJDBCConnection());
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Close Connection fails");
        }
    }

    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("Close ResultSet fails");
        }
    }

    public static void closePreparedStatement(PreparedStatement prepare) {
        try {
            if (prepare != null) {
                prepare.close();
            }
        } catch (SQLException e) {
            System.out.println("Close PreparedStatement fails");
        }
    }
}
