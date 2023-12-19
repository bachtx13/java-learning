/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author admin
 */
public class DemoGeneric {
    public static void main(String[] args) {
        Dictionary<String, String> d = new Dictionary<String, String>("Study", "hoc");
        String english = d.getKey();
        String vietnamese = d.getValue();
        System.out.println(english + ": " + vietnamese);
    }
}
