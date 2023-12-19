/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.sub;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao 2 số a và b: ");
        
        try {
            float a, b;
            System.out.println("Nhập a: ");
            a = scan.nextFloat();

            System.out.println("Nhập b ");
            b = scan.nextFloat();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
