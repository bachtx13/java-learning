/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author DELL
 */
public class Room {
    private int id;
    private String room_number;
    private String room_type;
    private String floor;
    private String status;
    private String price;
    private byte[] image;

    public Room() {
    }

    public Room(int id, String room_number, String room_type, String floor, String status, String price, byte[] image) {
        this.id = id;
        this.room_number = room_number;
        this.room_type = room_type;
        this.floor = floor;
        this.status = status;
        this.price = price;
        this.image = image;
    }

    public Room(String room_number, String room_type, String floor, String status, String price, byte[] image) {
        this.room_number = room_number;
        this.room_type = room_type;
        this.floor = floor;
        this.status = status;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", room_number=" + room_number + ", room_type=" + room_type + ", floor=" + floor + ", status=" + status + ", price=" + price + ", image=" + image + '}';
    }

   


    

    
    
}
