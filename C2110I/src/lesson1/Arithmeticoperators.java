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
public class Arithmeticoperators {
    public static void main(String[] args) {
        int a= 10, b= 25;
        int sum = a + b + 33 - 44;
//        System.out.println("sum = " + sum);
    // phép chia mẫu số phải #0
        float x = (float) a / b;
        System.out.println("x = " + x );
    // phép chia lấy dư
        System.out.println("a % b = " + (a % b));
        
        a++;
        System.out.println("a = " + a);
        a--;
        System.out.println("a = " + a);
    }
}
