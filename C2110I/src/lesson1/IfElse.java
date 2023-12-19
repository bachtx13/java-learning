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
public class IfElse {
    public static void main(String[] args) {
        // 1-Thứ 2, 2- Thứ 3, 3- Thứ 4, ...
        Scanner days = new Scanner(System.in);
        
        System.out.println("nhap vao ngay : ");
        int day = days.nextInt();
        
        
        if( day == 1) {
            System.out.println(" Day la thu 2");
        }else if(day == 2){
            System.out.println("Day la thu 3");
        }else if(day == 3){
            System.out.println("Day la thu 4");
        }else if(day == 4){
            System.out.println("Day la thu 5");
        }else if(day == 5){
            System.out.println("Day la thu 6");
        }else if(day == 6){
            System.out.println("Day la thu 7");
        }else if(day == 7){
            System.out.println("Day la thu Chu Nhat");
        }else{
            System.out.println("Day khong hop le");
        }
    }
}
