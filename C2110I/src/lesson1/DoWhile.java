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
public class DoWhile {
    public static void main(String[] args) {
        int i =0;
        int n =3;
        do {
            System.out.println("toi dang trong vong lap do while");
            System.out.println("i= " +i);
            i++;
        }while(i < n);
        
        for(;;){
            System.out.println("Vong lap vo han: ");
        }
    }
}
