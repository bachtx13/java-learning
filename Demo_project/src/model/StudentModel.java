/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import common.ICommon;
import dao.JDBCConect;
import entity.Student;
import java.sql.Connection;
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
public class StudentModel implements ICommon<Student> {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<Student> getAll() {

        ArrayList<Student> arrayList = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try {
            connection = JDBCConect.getJDBCConnection();
            preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Student student = new Student();
                student.setRoll_number(rs.getInt("roll_number"));
                student.setName(rs.getString("Name"));
                student.setGender(rs.getInt("gender"));
                student.setDob(rs.getString("dob"));
                student.setEmail(rs.getString("email"));
                student.setMoible(rs.getString("mobile"));
                student.setAddress(rs.getString("address"));

                arrayList.add(student);
            }
            return arrayList;
        } catch (SQLException ex) {

        } finally {
            JDBCConect.closeResultSet(rs);
            JDBCConect.closePreparedStatement(preparedStatement);
            JDBCConect.closeConnection(connection);

        }
        return null;

    }

    @Override
    public Student getOne(int id) {
        String sql = "SELECT * FROM student where roll_number = ?";
        try {
            connection = JDBCConect.getJDBCConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setRoll_number(rs.getInt("roll_number"));
                student.setName(rs.getString("name"));
                student.setGender(rs.getInt("gender"));
                student.setDob(rs.getString("dob"));
                student.setEmail(rs.getString("email"));
                student.setMoible(rs.getString("mobile"));
                student.setAddress(rs.getString("address"));
                return student;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            JDBCConect.closeResultSet(rs);
            JDBCConect.closePreparedStatement(preparedStatement);
            JDBCConect.closeConnection(connection);

        }
        return null;
    }

    @Override
    public boolean add(Student obj) {
         boolean flag = false;
        String sql = "INSERT INTO student(roll_number, name, dob, email, mobile, address,gender)VALUES(?,?,?,?,?,?,?)";
        try {
            connection = JDBCConect.getJDBCConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, obj.getRoll_number());
            preparedStatement.setString(2, obj.getName());
            preparedStatement.setString(3, obj.getDob());
            preparedStatement.setString(4, obj.getEmail());
            preparedStatement.setString(5, obj.getMoible());
            preparedStatement.setString(6, obj.getAddress());
            preparedStatement.setInt(7, obj.getGender());
           
            if(preparedStatement.executeUpdate()>0){
                System.out.println("aaaa");
                flag= true;
            }            
        } catch (SQLException ex) {
          
        } finally {
            
            JDBCConect.closePreparedStatement(preparedStatement);
            JDBCConect.closeConnection(connection);

        }
        return false;

    }

    @Override
    public boolean update(Student obj) {
        boolean flag = false;
        String sql = "Update student set roll_number = ?, name = ?, gender = ?, dob = ? , email = ?  ,mobile = ? ,address = ? where roll_number = ?";

        try {
            connection = JDBCConect.getJDBCConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, obj.getRoll_number());
            preparedStatement.setString(2, obj.getName());
            preparedStatement.setInt(3, obj.getGender());
            preparedStatement.setString(4, obj.getDob());
            preparedStatement.setString(5, obj.getEmail());
            preparedStatement.setString(6, obj.getMoible());
            preparedStatement.setString(7, obj.getAddress());
            preparedStatement.setInt(8, obj.getRoll_number());
            if (preparedStatement.executeUpdate() > 0) {
                flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            JDBCConect.closePreparedStatement(preparedStatement);
            JDBCConect.closeConnection(connection);

        }

        return flag;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        StudentModel sm = new StudentModel();
        List<Student> alist = sm.getAll();
        for (Student s : alist) {
            System.out.println(s);

        }
//
        System.out.println(new StudentModel().getOne(1));

//        Student student = new Student(2, 1, "Hong Ha", "23/6/1999", "ha@gmail.com", "3321", "hihi");
//        new StudentModel().update(student);
////        
//        Student student = new Student(4, 1, "Hong Ha", "23/6/1999", "ha@gmail.com", "3321", "haha");
//        new StudentModel().add(student);
    }

}
