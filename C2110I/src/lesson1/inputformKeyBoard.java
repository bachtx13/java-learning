package lesson1;


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
public class inputformKeyBoard {
    public static void main(String[] args) {
        int a, x;
        float f;
        double d;
        boolean b;
        String firstName;
        String fullName;
        
        
        Scanner scanner = new Scanner(System.in); 
//        scanner.nextInt();
        
//        System.out.println("Nhap 2 gia tri: ");
//        a = scanner.nextInt();
//        x = scanner.nextInt();
//        System.out.println("a = " + a + ", x = " + x );
        
        // BOOLEAN
//        System.out.println("Nhap vao gia tri True or false: ");
//        b = scanner.nextBoolean();
//        System.out.println("Ban vua nhap : " + b);
        
        // neu sử dụng nhap 1 từ thôi
        System.out.println("Nhap vao tên của bạn : ");
        firstName = scanner.next();
        System.out.println("Xin chao : " + firstName);
    }
}
