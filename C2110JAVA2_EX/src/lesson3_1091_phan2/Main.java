/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3_1091_phan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;

        do {
            showMenu();
            choose = Utility.scanInt(scan);
            switch (choose) {
                case 1:
                    DataController.getinstance().input();
                    break;
                case 2:
                    DataController.getinstance().display();
                    break;
                case 3:
                    DataController.getinstance().sortByAuthorName();
                    DataController.getinstance().display();

                    break;
                case 4:
                    DataController.getinstance().saveBinaryFile(); // lưu kiểu nhị phân
                    break;
                case 5:
                    DataController.getinstance().saveTextFile(); 
                    break;
                case 6:
                    DataController.getinstance().zipFile(); 
                    break;
                case 7:
                    DataController.getinstance().readBinaryFile(); 
                    DataController.getinstance().display();
                    break;
                case 8:
                    System.out.println("Thoát chương trình!!");
                    break;
                default:
                    System.out.println("Nhập sai !!");
                    break;
            }
        } while (choose != 8);
    }

    static void showMenu() {
        System.out.println("1. Nhập N cuốn sách:  ");
        System.out.println("2. Hiển Thị: ");
        System.out.println("3. sắp xếp theo tên tác giả: ");
        System.out.println("4. Lưu thông tin data.obj: ");
        System.out.println("5. lưu thông tin file.txt: ");
        System.out.println("6. Nén file data.txt thành data.dfl: ");
        System.out.println("7. đọc dữ liệu rồi hiển thị file  data.obj rồi hiển thị ra màn hình :");
        System.out.println("8. Thoát!!");
        System.out.println("choose: ");
    }
}
