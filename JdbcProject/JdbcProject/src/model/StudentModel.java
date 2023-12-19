/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.ICommon;
import dao.JDBCConnect;
import entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Hoang Anh
 */
public class StudentModel implements ICommon<Student> {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<Student> getAll() {
        ArrayList<Student> arrayList = new ArrayList<>();
        String sql = "SELECT * FROM student";
        try {
            // kết nối được với db
            connection = JDBCConnect.getJDBCConnection();
            preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setRollNumber(rs.getInt("roll_number"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getInt("gender"));
                student.setDob(rs.getString("dob"));
                student.setEmail(rs.getString("email"));
                student.setMobile(rs.getString("mobile"));
                student.setAddress(rs.getString("address"));

                arrayList.add(student);
            }
            return arrayList;
        } catch (SQLException e) {
        } finally {
            JDBCConnect.closeResultSet(rs);
            JDBCConnect.closePreparedStatement(preparedStatement);
            JDBCConnect.closeConnection(connection);
        }
        return null;
    }



    public static void main(String[] args) {
        System.out.println(new StudentModel().getAll());
        

    }

    @Override
    public Student getOne(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
