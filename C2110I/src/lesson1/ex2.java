/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ex2 {
    public static void main(String[] args) {
        System.out.println("halooo");
        float a = 4.2f;
        int b = 1;
        float z = a + b;
        
        System.out.println("Sum = " +z);
        System.out.println("Sum: " + a + "+" + b + "=" + z);
        System.out.format(" Sum: %f + %d = %f \n", a, b, z );
        
        
       Scanner tenbien2 = new Scanner(System.in);
       
        System.out.println("Enter ab: ");
        float ab = tenbien2.nextFloat();
        System.out.println("AB: " +ab);
        
        
//        tenbien2.nextFloat();
//        System.out.println("nhap d: ");
//        x = tenbien2.nextFloat();
//        System.out.println("x " + x);
//        float e = Float.parseFloat(System.in);
//        System.out.println("e : " +e );
       
       
    }
}
