 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

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
import tbl_exam.Tbl_exam;

/**
 *
 * @author std
 */
public class JDBCConnect {
    public static void insert(Tbl_exam tbl_exam){
        Connection con = null;
        PreparedStatement statement = null;
        
        try {
            con = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            // thư viện chuẩn bị kết nối đến database
            // thêm dữ liệu vào database
            String sql = " insert into Tbl_exam(exam_name,exam_room,exam_date, exam_duration) values (?,?,?,?)";
            statement = con.prepareCall(sql);
            statement.setString(1, tbl_exam.getExam_name());
            statement.setString(2, tbl_exam.getExam_room());
            statement.setString(3, tbl_exam.getExam_date());
            statement.setInt(4, tbl_exam.getExam_duration());
            
            
             statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
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
    
    
    
    
    public static List<Tbl_exam> getExamList() { // lấy danh sách sinh viên
        List<Tbl_exam> examList = new ArrayList<>();
        Connection con = null;
        PreparedStatement statement = null;
        try {
            //Mở kết nối đến database
            con = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            // thư viện chuẩn bị kết nối đến database
            // thêm dữ liệu vào database
            String sql = "select * from tbl_exam";
            statement = con.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery(); // lấy ra danh sách sinh viên

            // đọc dữ liệu ra
            while (resultSet.next()) {
                examList.add(new Tbl_exam(//add sinh vieen vao 
                        resultSet.getString("exam_name"), // roi doc tung thang 1
                        resultSet.getString("exam_room"),// roi doc tung thang 1
                        resultSet.getString("exam_date"),// roi doc tung thang 1
                        resultSet.getInt("exam_duration")// roi doc tung thang 1
                ));
            }
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
        return examList;
    }
    
//    public static void addExam
}
