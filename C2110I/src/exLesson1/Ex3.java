/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exLesson1;

/**
 *
 * @author admin
 */
public class Ex3 {
    public static void main(String[] args) {
        int n = 4;
        int j, i, k;
        for(i = 0; i < n; i++){
            for(j = -n + 1; j < n; j++){
                if(j < - i  || j > i ){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i - Math.abs(j) + 1);
                    
                }
            } 
            System.out.println("");
        }
    }
}
