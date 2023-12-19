/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Ngta khuyeen nen khai bao la:
        // khi gán linkedList hay Vector đều đc
        // còn khai báo Array k gán đc 
        List<String> list2 = new ArrayList<>();
//        list2 = new Vector<>();
        list2 = new LinkedList<>();

        People p = new People();
        p.name = "A";
//        p.age = 20;
        p.address = "Ha Noi";
        
        System.out.println("Name" + p.name);
    }
}
