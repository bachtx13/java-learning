/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Test {
    public static void main(String[] args) {
        LuxuryCar myLuxuryCar = new LuxuryCar();
        myLuxuryCar.input();
        myLuxuryCar.getInfor();
        
        
        float total = myLuxuryCar.calculatePrice(20000);
        System.out.println(" \n total price=" +total);
    }
}
