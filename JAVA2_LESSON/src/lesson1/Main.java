/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        int x, y;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhập x = ");
        x = Integer.parseInt(scan.nextLine());
        
        System.out.println("Nhập Y  = ");
        y = Integer.parseInt(scan.nextLine());
        
        // Cách 1 : fix bằng logic
        // cach 2: fix = try catch
        try {
            int s = x/y;
             System.out.println("s = " + s);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Ket Thuc");
        }
        
    }
}
