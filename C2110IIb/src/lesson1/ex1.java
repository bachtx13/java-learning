/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author admin
 */
public class ex1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("nguyen thi hong ha");
//        builder.setCharAt(0,Character.toUpperCase( builder.charAt(0)));
        for (int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i) == ' '){
                builder.setCharAt(i+1,Character.toUpperCase( builder.charAt(i+1)));
            }
        }
        System.out.println(builder);
       
       
    }
}
