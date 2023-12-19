
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
public class UsingManagerCat {

    static ColorManager colorManager = new ColorManager();//QuanLyMamau
    static ManagerCat managerCat = new ManagerCat(); //Quan Ly danh sach con meo
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choose;
        
         do {            
            showMenu();
            choose = Integer.parseInt(scan.nextLine());
            switch(choose){
                case 1:
                    colorManager.nhap();
                    break;
                case 2:
                    managerCat.nhap(colorManager);
                    break;
                case 3:
                    managerCat.hienthi();
                    break;
                case 4:
                    managerCat.sortByColor();
                    managerCat.hienthi();
                    break;
                case 5:
                    managerCat.searchingByLoai();
                    break;
                case 6:
                    System.out.println("Thoát");
                    break;
                case 7 :
                    System.out.println("Nhập sai ");
                    break;
                  
            }
        } while (choose != 7);
    }

    static void showMenu() {
        System.out.println("1. Nhap danh sach ma mau: ");
        System.out.println("2. Nhập thông tin của n con mèo");
        System.out.println("3. Hiển thị thông tin");
        System.out.println("4. Sắp xếp danh sách theo mau");
        System.out.println("5. Tìm kiếm thông tin theo loai");
        System.out.println("6. Sắp xếp danh sách màu theo bảng màu trong lớp ColorManager");
        System.out.println("7. Thoát");
        System.out.println("Chon: ");
    }
}
