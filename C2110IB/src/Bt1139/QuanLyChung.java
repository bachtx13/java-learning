/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt1139;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QuanLyChung {

    static XeMayHaNoi xeMayHaNoi = new XeMayHaNoi();
    static XeMayHoaBinh xeMayHoaBinh = new XeMayHoaBinh();

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());

            switch (choose) {
                case 1:
                    xeMayHoaBinh.nhap();
                    break;
                case 2:
                    xeMayHaNoi.nhap();
                    break;
                case 3:
                    sort();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Thoát!!!!!!!");
                    break;

                default:
                    System.out.println("Nhập saiii!!!!!!");
                    break;
            }
        } while (choose != 6);
    }

    static void showMenu() {
        System.out.println("1. Nhập thông tin cho n xe máy tại tỉnh Hòa Bình.");
        System.out.println("2. Nhập thông tin cho n xe máy tại tỉnh Hà Nội.");
        System.out.println("3. Sắp xếp danh sách tăng theo biển số xe.");
        System.out.println("4. Tìm kiếm thông tin xe theo biển số xe.");
        System.out.println("5. Thống kê số lượng xe đang quản lý.");
        System.out.println(" 6. Thoát!!!!!");
        System.out.println("Chon: ");
    }
    
    static void showMenuByAddress(){
        System.out.println("1.Hoa Binh");
        System.out.println("2.Ha Noi");
        System.out.println("3.choose!!!!!!");
    }

    static void sort() {
        showMenu();
        
    }
}
