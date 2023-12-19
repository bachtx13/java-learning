/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.io.*;

/**
 *
 * @author admin
 */
public class Example {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = null;

        fis = new FileInputStream("D:/myfile.txt");
        int k;

        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }

        fis.close();
    }
}
