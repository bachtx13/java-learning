/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AnhTH
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println(new Main().getMailFromName("to hoang anh"));
        System.out.println(new Main().standardizationName("to hoang anh"));
        System.out.println(new Main().getNormalString("XXXYYYZZZ"));
        String string = "20-01-2021";
        String[] arr = string.split("-");
        System.out.println(arr[2]);
        
    }

    //get mail from name
    public String getMailFromName(String name) {
        String[] arr = name.trim().toLowerCase().split(" ");
        String mail = arr[arr.length - 1] + ".";
        for (int i = 0; i < arr.length - 1; i++) {
            //get character at index 0
            mail += arr[i].charAt(0);
        }
        
        return mail + "@aptechlearning.edu.vn";
    }

    //standardization name
    public String standardizationName(String name) {
        String[] arr = name.trim().toLowerCase().split(" ");
        String result = "";
        for (String word : arr) {
            //upper case first character
            result += (word.charAt(0) + "").toUpperCase() + word.substring(1) + " ";
        }
        return result.trim();
    }

    //XXX-YYY-ZZZ
    public String getNormalString(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i = i + 3) {
            result += input.substring(i, i + 3) + "-";
        }
        return result.substring(0, result.length() - 1);
    }
}
