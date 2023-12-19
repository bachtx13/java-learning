/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1139;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        int choose;
        //khoiwr tao doi tuong thong qua ham duoi nay
        
        //instance la bien tinh
//        DataMgr dataMgr =  DataMgr.getInstance(); nâng cấp 2
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    DataMgr.getInstance().inputBook(); // nâng cấp 2 , sẽ gọi thẳng 
                    break;
                case 2:
                    DataMgr.getInstance().displayBook();
                    break;
                case 3:
                    DataMgr.getInstance().inputAuthor();
                    break;
                case 4:
                    DataMgr.getInstance().findBookByAuthor();
                    break;
                case 5:
                    System.out.println("Thoat!!!!!!");
                    break;
                default:
                    System.out.println("Nhap saiiiiii");
                    break;
            }
        } while (choose != 5);
    }

    static void showMenu() {
        System.out.println("1. Nhập thông tin sách: ");
        System.out.println("2. Hiển Thị: ");
        System.out.println("3. Nhập thông tin tác giả: ");
        System.out.println("4. Tìm kiếm: ");
        System.out.println("5. Thoát chương trình");
    }

     
}
