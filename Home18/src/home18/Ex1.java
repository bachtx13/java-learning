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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "nguyen thi hong ha";
        String[] arr = str.split(" ");
        String rs = "";
        for (String string : arr) {
            rs += (string.charAt(0) + "").toUpperCase() + string.substring(1) + " ";
        }
        System.out.println(rs.trim());
    }

}
