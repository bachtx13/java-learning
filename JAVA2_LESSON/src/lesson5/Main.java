/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

import java.util.Scanner;

/**
 * Main Thread
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread start:");
        System.out.println("step 1:");
        
        // b1 khởi tạo ra luồng mới T1
        // đây là khởi tạo trực tiếp thông qua thread
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scan = new Scanner(System.in);
                //Bắt đầu xử lý code của luồng mới
                for (int i = 0; i < 20; i++) {
                    System.out.println("T1-> enter ->");
                    int v1 = scan.nextInt();
                    System.out.println("T1 ->" + v1);
                }
            }
        });

        // khởi tạo ra luồng mớI T2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scan = new Scanner(System.in);
                // t2 xử lý code trong luông t2
                for (int i = 0; i < 30; i++) {
                    System.out.println("T2-> enter ->");
                    int v2 = scan.nextInt();
                    System.out.println("step2:" + v2);
                }
            }

        });
        
        t1.start(); //Bắt đầu chạy T1
        t2.start(); // để t2 chạy phải gọi đến start
        System.out.println("step2:");

        System.out.println("Main Thread Stop");
    }
}
