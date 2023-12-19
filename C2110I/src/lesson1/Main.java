    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello");
        int x = 5;
        int y = 6;
        int z = x +y;
        System.out.println("ket qua la : " + x + "+" + y + "=" + z );
        System.out.format("ket qua : %d +%d = %d \n", x, y, z );
        
        char c='C'; // hiển thị kí tự 
        String str = "Minh la Ha day"; // khai bao chuoi 
        System.out.println("ket qua: " + str);
        
        //Nhap du lieu 
        Scanner tenbien = new Scanner(System.in); // cách khai báo 
        
        // Nhap chuoi
        System.out.println("Nhap str: ");
        str = tenbien.nextLine();
        System.out.println("Str =" + str);
        
        // Nhập số nguyên 
        System.out.println(" Enter X: ");
        x = tenbien.nextInt();
        System.out.println("Int =" + x);
        
        System.out.println(" Enter Y: ");
        y = tenbien.nextInt();
        System.out.println("Int =" + y);
        
        
        // nếu mà sau khi nhập số nguyên quay ra nhập ChUỖI => error lỗi 
       // => FIXXXX 1: 
        tenbien.nextLine();
        System.out.println("Nhap str: ");
        str = tenbien.nextLine();
        System.out.println("Str =" + str);
       
        
        // FIX 2:
        
        System.out.println(" Enter Y: ");
        y = Integer.parseInt(tenbien.nextLine()); // fix ở chỗ này 
        System.out.println("Int =" + y);
        
        System.out.println("Nhap str: ");
        str = tenbien.nextLine();
        System.out.println("Str =" + str);
        
        
        
        
        
        
    }
  
}
