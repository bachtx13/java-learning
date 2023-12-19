/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
//        testEnum();
        testArray();
    }

    public static void testArray() {
        Scanner scan = new Scanner(System.in);
        //Khai bao 1 mang so nguyen gom 5 phan tu
        int[] t = new int[5];
        // chu y muon thay kieu du lieu khac -> thay int-> strING FLOAT , DOUBLE
        //  GÁN dữ liệu 
        t[0] = 6;
        t[1] = 3;
        System.out.println("Nhap t[2]= ");
        t[2] = scan.nextInt();

        //Nhap cho cả mảng
        for (int i = 0; i < t.length; i++) {
            System.out.printf("Nhap t[%d]= ", i);
            t[i] = scan.nextInt();
        }

        // Tính tổng số chẵn trong mảng t
        // khai bao tong
        int total = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                total = total + t[i];
            }
        }
    }

    static enum LIGHT_STATUS {
        ON, OFF
    };

    static enum STUDENT_STATUS {
        PENDING, LEARNING, DROPOUT
    };

    public static void testEnum() {
        //Xay dung mot chuong trinh de quan li trang thai cua bóng đèn
        //status: 2 trạng thái :0N-OFF;
        //Cách 1 : String status ="ON/OFF"
        // cách 2:
        /**
         * STATUS 0: OFF; STATUS 1: ON;
         */
        //int status = 0;
        LIGHT_STATUS status = LIGHT_STATUS.ON;
        System.out.println("status: " + status);
        //Quản lý trạng thái của sinh viên :PENDING, learning, dropout
        /**
         * 0 ->> Pending 1 -> learning 2 -> dropout =>> CACH NÀY RẤT RỦI RO
         */
        // THông thường trong java sẽ dùng kiểu dlieu Enum
        STUDENT_STATUS status1 = STUDENT_STATUS.LEARNING;
        switch (status) {
            case ON:

                break;
            case OFF:

                break;
        }
    }
}
