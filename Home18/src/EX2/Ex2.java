/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

/**
 *
 * @author admin
 */
public class Ex2 {

    public static void main(String[] args) {
        String str = "Java is high-level,class-based,object-oriented progamming language that is designed to have as few implementation dependencies as possible.it is a general-purpose progamming language intended to let progammers write once,run anywhere";
        String str2="";
        for (int i = 0; i < str.length(); i++) {
            str2 = str.replace(",", ", ");
            
        }
        System.out.println(str2);

//        for (int i = 0; i < str.length(); i++) {
//            char c =str.charAt(i);
//            if (Character.isLetter(c) || Character.isWhitespace(c) ||Character.) {
//                System.out.print(c);
//            } 
//        }

    }
////        System.out.println(c);
//
//}

}
