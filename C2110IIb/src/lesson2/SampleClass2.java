/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author admin
 */
public class SampleClass2 {
    public static void main(String[] args) {
//        String str = "He7ll89o 123 Wor23ld! ";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if(Character.isDigit(c)){
//               
//            }else{
//                 System.out.print(c);
//            }
//        }
        String str = "He7ll89o 123 Wor23ld!";
        String result = str.replaceAll("\\d", "");
        System.out.println(result);
    }
}

