/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.ArrayList;


/**
 *                      MANG DONG JAVA
 * @author admin
 */
public class mangDong {
    public static void main(String[] args) {
        testDynamicArray(); // khai bao mang dong
    }
    public static void testDynamicArray() {
        ArrayList<Integer> t = new ArrayList<> ();
//        ArrayList<String> str = new ArrayList<> ();
    //Them mot phan vao trong mang 
    t.add(12);
    t.add(10);
    t.add(9);
    
    // tính ra độ dài phần tử mảng
        System.out.println("length : " + t.size());
        
    // Xoa 1 phan tu khoi mang
    t.remove(1);
    
    
    // lay du lieu ra khoi mang
        for (int i = 0; i < t.size(); i++) {
            System.out.printf("\n t[%d] = %d", i, t.get(i));
        }
    }
}
