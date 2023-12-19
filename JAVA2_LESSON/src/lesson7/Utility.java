/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Utility {
     public static int scanInt(Scanner scan) {
        int value;
        while (true) {
            try {
                value = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại: ");
            }
        }
        return value;
    }
}
