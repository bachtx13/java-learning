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
public class Ex4 {

    public static void main(String[] args) {
        //in ra bảng cửu chương

        for (int i = 1; i < 10; i++) {
            System.out.println("Bảng Cửu Chương " + i +" là :");
            for (int j = 0; j <= 10; j++) {
                System.out.format("%2d * %2d = %3d \n", i, j,(i*j));
            }
            System.out.println(" ");
        }

    }

}
