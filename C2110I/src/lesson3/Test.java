/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args) {
        BookNew b = new BookNew();
        
        b.setName("Lap trinh C");
        b.setPrice(-2000);
        
        System.out.println("Name = " + b.name);
        System.out.println("price = " + b.price);
        
    }
}
