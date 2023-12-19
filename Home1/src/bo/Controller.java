/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

/**
 *
 * @author admin
 */
public class Controller {
    public static void quadraticEquation2 (int a, int b, int c) {
       double x1, x2, delta;
       
       delta = b*b - 4*a*c;
       if (a==0){
           System.out.println("Error => Nhập a khác 0:");
       }else if (delta > 0 ){
           x1 =((-b + Math.sqrt(delta))/(2*a));
           x2 =((-b - Math.sqrt(delta))/(2*a));
           
           System.out.println("Phương trình có 2 nghiệm phân biệt " 
                   + "x1 =" + x1 + " x2 =" + x2);
       }else if (delta < 0 ){
           System.out.println("Phuong trinh vô nghiệm !!!");
       }else {
           x1 = (-b/(2*a));
           System.out.println(" x1=x2= :" + x1);
       }
    }
}
