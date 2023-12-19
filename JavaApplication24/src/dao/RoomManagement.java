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
import entity.Room;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author DELL
 */
public class RoomManagement {

    public static List<Room> getRoomList() {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        List<Room> RoomList = new ArrayList<>();
        String sql = "SELECT*FROM room";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", Config.USERNAME, Config.PASSWORD);
            preparedStatement = conn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                
                Room rm = new Room();
                preparedStatement.setInt(1, rm.getId());
                preparedStatement.setString(2, rm.getRoom_number());
                preparedStatement.setString(3, rm.getRoom_type());
                preparedStatement.setString(4, rm.getFloor());
                preparedStatement.setString(5, rm.getStatus());
                preparedStatement.setString(6, rm.getPrice());
                Blob b = rs.getBlob("image");
                rm.setImage(b.getBytes(0,(int) b.length() ));
                RoomList.add(rm);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Close.closeConnection(conn);
            Close.closeResultSet(rs);
            Close.closePreparedStatement(preparedStatement);

        }
        return RoomList;

    }

    public static void add(Room rm) throws IOException {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        boolean flag = false;
        String sql = "INSERT INTO room(id, room_number, room_type,floor,status, price,image) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management", Config.USERNAME, Config.PASSWORD);
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, rm.getId());
            preparedStatement.setString(2, rm.getRoom_number());
            preparedStatement.setString(3, rm.getRoom_type());
            preparedStatement.setString(4, rm.getFloor());
            preparedStatement.setString(5, rm.getStatus());
            preparedStatement.setString(6, rm.getPrice());
            
            if(rm.getImage() !=null){
                Blob image = new SerialBlob(rm.getImage());
                preparedStatement.setBlob(7, image);
            }else{
                Blob image= null;
                preparedStatement.setBlob(7, image);
            }

            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("aaaa");
                flag = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Close.closeConnection(conn);
            Close.closePreparedStatement(preparedStatement);

        }
       

    }

    public static void update(Room rm) throws IOException {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "UPDATE room set room_number =?, room_type =?,floor=?, status =?, price =?, image =? "
                + " where id = ?";

        try {
            conn = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            preparedStatement = conn.prepareStatement(query);

            preparedStatement.setInt(1, rm.getId());
            preparedStatement.setString(2, rm.getRoom_number());
            preparedStatement.setString(3, rm.getRoom_type());
            preparedStatement.setString(4, rm.getFloor());
            preparedStatement.setString(5, rm.getStatus());
            preparedStatement.setString(6, rm.getPrice());
            File input = null;
            BufferedImage read = ImageIO.read(input);
            if(rm.getImage() !=null){
                Blob image = new SerialBlob(rm.getImage());
                preparedStatement.setBlob(7, image);
            }else{
                Blob image= null;
                preparedStatement.setBlob(7, image);
            }
            preparedStatement.executeQuery();

        } catch (SQLException e) {
        } finally {
            Close.closeConnection(conn);
            Close.closePreparedStatement(preparedStatement);

        }
        

    }

    public boolean delete(int id) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "DELETE from room where id= ?";

        try {
            conn = DriverManager.getConnection(Config.DB_URL, Config.USERNAME, Config.PASSWORD);
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, id);
        } catch (SQLException e) {
        } finally {
            Close.closeConnection(conn);
            Close.closePreparedStatement(preparedStatement);
            Close.closeResultSet(rs);
        }
        return false;

    }

}
