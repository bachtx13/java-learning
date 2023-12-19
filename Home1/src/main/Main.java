/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bo.Controller;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Enter a: ");
        a = scan.nextInt();
        
        System.out.println(" Enter b: ");
        b = scan.nextInt();
        
        System.out.println("Enter c");
        c = scan.nextInt();
        
        Controller controller = new Controller();
        controller.quadraticEquation2(a, b, c);
    }
}
