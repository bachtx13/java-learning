/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5_1101;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread start:");
        System.out.println("step 1:");
        
        CustomThread t1 = new CustomThread();
        t1.setName("t1");
        t1.start();
        
        
    }
}
