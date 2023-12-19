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
public class Toperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vào số a: ");
        int a = scan.nextInt();
        
        String str1 = "a la so chẵn ";
        String str2 =" a la số lẻ";
        String str ="";
        
       
        str = ( a % 2 == 0 ) ? str1 : str2;
        
        System.out.println("kq: " + str);
    }
}
