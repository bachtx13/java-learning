/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt984;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bt984 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao 2 số a và b: ");
        
        try {
            float a, b;
            System.out.println("Nhập a: ");
            a = scan.nextFloat();

            System.out.println("Nhập b ");
            b = scan.nextFloat();
            
            System.out.println(Bt984.phepchia( a,  b));
            
            
            
        } catch (Exception e) {
            System.out.println("Tuổi nhập vào chưa hợp lệ. Lỗi: " + e.toString());
        }
        
    }
    
    static float phepchia(float a, float b){
        float x = a/b;
        if(  b == 0){
            throw new ArithmeticException("Cannot devide by 0");
        }else{
            return x;
            
        }
    }
    
}
