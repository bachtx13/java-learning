/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author admin
 */
public class TestStatic {
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();
         
        People.name = "A";
        People.name = "B";
        
        System.out.println("People.name = " + People.name);
        System.out.println("People.name = " + People.name);    
    }
    
    void testing(){
        System.out.println("Testing........");
    }
    static void showMenu(){
        System.out.println("Menu..........");
    }
}
