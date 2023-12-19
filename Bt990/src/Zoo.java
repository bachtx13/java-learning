
import java.util.ArrayList;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Zoo {
    ArrayList<Room> roomList;

    public Zoo() {
        roomList = new ArrayList<>();
    }
    
    public void addRoom(Room room ) {
        roomList.add(room);
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
    
    
    public void removeRoom(int roomNo){
        for (Room room : roomList) {
            if(room.getRoomNo()== roomNo){
                roomList.remove(room);
                break;
            }
        }
    }
    
    public void addAnimal(Animal animal){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập mã chuồng cần thêm động vật ");
        int roomNo = Integer.parseInt(scan.nextLine());
        
        for (Room room : roomList) {
            if(room.getRoomNo() == roomNo){
                room.addAnimal();
            }
            
        }
    }
    
    public void removeAnimal(int rollno, String name){
        for (Room room : roomList) {
            if(room.getRoomNo() == rollno){
                room.removeAnimal(name);
            }
        }
    }
    
     public void removeAniamal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma chuong can xoa dong vat: ");
        int roomNo = Integer.parseInt(scan.nextLine());
        
        System.out.println("Nhap ten dong vat can xoa: ");
        String name = scan.nextLine();
        
        removeAnimal(roomNo, name);
    }
    
    public void display(){
        for (Room room : roomList) {
            room.display();
        }
    }
}
