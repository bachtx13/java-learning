
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
public class TestZoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Enter number of Room: ");
                    int n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        Room room = new Room();
                        room.input();

                        zoo.addRoom(room);
                    }
                    break;
                case 2:
                    System.out.println("Enter room's name is deleted: ");
                    // khai baso
                    int roomNo = Integer.parseInt(scan.nextLine());
                    // goi den zoo
                    zoo.removeRoom(roomNo);
                    break;
                case 3:
                    addAnimal(zoo);
                    break;
                case 4:
                    zoo.removeAniamal();
                    break;
                case 5:
                    zoo.display();
                    break;
                case 6:
                    System.out.println("Exit!!!");
                    break;
                default:
                    System.out.println("input  failed!!!");
                    break;
            }

        } while (choose != 6);

    }

    static void addAnimal(Zoo zoo) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of animal: ");
        int n = Integer.parseInt(scan.nextLine());
        int choose; // khai bao 
        // caay menu để xem ngta thêm loại động vật nào ?
        for (int i = 0; i < n; i++) {
            System.out.println("1. Create Tiger");
            System.out.println("2. Create Dog");
            System.out.println("Other. Create Cat");
            choose = Integer.parseInt(scan.nextLine());

            Animal animal;
            switch (choose) {
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

            System.out.println("===Room List:===");
            Room room = null;
            for (int j = 0; j < zoo.getRoomList().size(); j++) {
                room = zoo.getRoomList().get(j);
                System.out.format("\n(%d)-(%s)", room.getRoomNo(), room.getRoomName());
            }
            System.out.println("\n Choose RoomNo: ");
            int RoomNo = Integer.parseInt(scan.nextLine());
            for (int j = 0; j < zoo.getRoomList().size(); j++) {
                room = zoo.getRoomList().get(j);
                System.out.format("\n(%d)-(%s)", room.getRoomNo(), room.getRoomName());
                if(room.getRoomNo() == RoomNo){
                    break;
                }else{
                    room = null;
                }                 
            }
            if(room != null){
                room.addAnimal(animal);
            }
            

        }
    }

    static void showMenu() {
        System.out.println("1. Thêm chuồng");
        System.out.println("2. Xóa chuồng");
        System.out.println("3. Thêm con vật");
        System.out.println("4. Xóa con vật");
        System.out.println("5. Xem tất cả các con vật");
        System.out.println("6. thoat!!!!");
        System.out.println("Choose: ");

    }
}
