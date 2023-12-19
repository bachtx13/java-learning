/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home18;

/**
 *
 * @author admin
 */
public class Ex2 {
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "ATXGDJGDAASDDDA";
        for (int i = 0; i < str.length(); i++) {
            if (i%3==0 && i !=0) {
                System.out.print("-");
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i));
            }
        }
    }

}
