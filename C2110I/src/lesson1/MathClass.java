/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author admin
 */
public class MathClass {
    public static void main(String[] args) {
        int a = 100, b = 265 ;
        float x = -322.822f;
        
        
        // Tim gia trị lớn nhất trong 2 giá trị a , b 
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("max a, b = " + max);
        System.out.println("min a,b = " + min);
        
        // log(a) trả về giá trị logarit
        System.out.println("log10(a)= " + Math.log10(a));
    }
    
}
