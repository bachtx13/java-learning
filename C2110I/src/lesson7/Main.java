/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập X = ");
        int x = Integer.parseInt(scan.nextLine());

        System.out.println("Nhập Y = ");
        int y = Integer.parseInt(scan.nextLine());

        // cách 1 : fix logic-> Bắt buộc fix theo cách này 
        /**if (y == 0) {
            System.out.println("Không được chia cho 0 !!!!");
        } else {
            int s = x / y;  
            System.out.println("KQ = " + s);
        }*/
        // Cách 2: Try.....catch....Finally
        try {
            // Nơi để những dòng code gây ra chết chương trình 
            int s = x / y;  
            System.out.println("KQ = " + s);
            
            int [] t = new int[2];
            // index chay tu 0-1  length = 2
            t[1] = 12;
            t[6] = 4;
            
            System.out.println("okok");
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException......");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException.......");
        }catch (Exception e) {
            System.out.println(" Exception Chết chương trình!!!!!!!!");
        }finally {
            // dù thành công hay thất bại cũng gọi vào đây 
            System.out.println("Finally");
        }
        
        float ss;
        try {
            ss = Calculator.chia(x, y);
             System.out.println("ss =" + ss);
        } catch (CalculatorException ex) {
            ex.showMsg();
        }
       
    }
}
