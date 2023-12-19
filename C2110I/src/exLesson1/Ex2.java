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
public class Ex2 {
    public static void main(String[] args) {
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Nhap vao chieu dai cua HCN: ");
        int a = scan2.nextInt();

        System.out.println("Nhap vao chieu rong cua HCN");
        int b = scan2.nextInt();
//        
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//               if(i == 0 || i == a- 1 || j == 0|| j == b-1 ){
//                    System.out.print("*");
//               }else{
//                   System.out.print(" ");
//               }
//            }
//            System.out.println("");
//        }
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("*");
            }
//            System.out.println(" ");
        }
    }
}
