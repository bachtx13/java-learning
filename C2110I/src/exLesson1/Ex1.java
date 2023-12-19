/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exLesson1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ex1 {

    public static void main(String[] args) {
        //Nhap vao kích thước chiều rộng và chiều cao :in ra hình chữ nhật các chữ **
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap vao chieu dai cua HCN: ");
        int a = scan.nextInt();

        System.out.println("Nhap vao chieu rong cua HCN");
        int b = scan.nextInt();

        System.out.println(" a = " + a);
        System.out.println("b = " + b);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    
    }
}
