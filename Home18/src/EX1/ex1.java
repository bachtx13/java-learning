/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

/**
 *
 * @author admin
 */
public class ex1 {
    public static void main(String[] args) {
        String str = "Ja8va Cl239ass Apt58ech";
        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
            if(Character.isLetter(c) || Character.isWhitespace(c)){
                System.out.print(c);
            }
        }
    }
}
