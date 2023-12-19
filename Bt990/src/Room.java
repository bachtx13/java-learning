
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
public class Room {
    int roomNo; 
    String roomName;
    ArrayList<Animal> animalList;
     // bình thường sẽ khởi tạo hàm tạo cùng dòng luôn 
    // nhưng để trong hàm tạo sẽ tối ưu đỡ tốn tài nguyên hơn
    public Room() {
        animalList = new ArrayList<>();
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    
    
    public void addAnimal(Animal animal){// theem 1 con vvat
        animalList.add(animal);
    }
    
     public void addAnimal() {
        Animal animal = createAnimal();
        
        animalList.add(animal);
    }
    
    public void removeAnimal(String name){
        //  tạo 1 mảng mới để khi xóa bỏ những tên giống nhau thì sẽ add vào mảng List 2
        // add sau sau đó gán lại cho List ban đầu
            ArrayList<Animal> animalList2 = new ArrayList<>();
        for (Animal animal : animalList) {
            if(!animal.getName().equalsIgnoreCase(name)){
                animalList2.add(animal);
            }
        }
         animalList = animalList2;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap roomNo: ");
        roomNo = Integer.parseInt(scan.nextLine());
        
        System.out.println("Nhập room Name :");
        roomName = scan.nextLine();
        
//        for (int i = 0; i < n; i++) {
//            Animal animal = createAnimal();
//            animalList.add(animal);
//        }

    }
    
    public  void display(){
        for (Animal animal : animalList) {
            animal.display();
            animal.showSound();
        }
    }
    
    
    public Animal createAnimal() {
        Scanner scan = new Scanner(System.in);
        Animal animal;
        
        System.out.println("1. Tao Tiger");
        System.out.println("2. Tao Dog");
        System.out.println("Khac. Tao Cat");
        System.out.println("Chon: ");
        int choose = Integer.parseInt(scan.nextLine());
        
        switch(choose) {
            case 1:
                animal = new Tiger();
                break;
            case 2:
                animal = new Dog();
                break;
            default:
                animal = new Cat();
                break;
        }
        animal.input();
        
        return animal;
    }
    
    
    
}
