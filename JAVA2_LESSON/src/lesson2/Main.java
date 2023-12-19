/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        //Phần 1 : List bản chất là 1 interface
        // arraylist => là 1 lớp đối tượng , cho phép quản lý dữ liệu động 
        // arraylist  => implement từ list
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("S1"); // index = 0
        arr1.add("S2"); // index = 1
        arr1.add("S3"); // index = 2
        arr1.add("S4"); // index = 3
        // độ dài leng: arr1.size();
        // sửa dữ liệu 
        arr1.set(1,"S22");
        for (String v : arr1) {
            System.out.println(v);
        }
        
        // Tìm hiểu về List thì có 3 lớp đối tượng kế từ từ interface này , arraylist, vector, linkedList
        Vector<String> arr2 = new Vector<>();
        // Tìm hiểu về vector
        arr2.add("S33");
        arr2.add("S00");
        arr2.add("S223");
        arr2.add("s990");
        System.out.println("Dữ liệu arr2: ");
        for (String v2 : arr2) {
            System.out.println(v2);
        }
        
        // LinkedList
        LinkedList<String> arr3 = new LinkedList<>();
        //phần 2: set hashSet, TreeSet
        Set<String> set = new HashSet<>();
        set.add("A1");
        set.add("A2");
        set.add("A3");
       
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
        }
        
        // Map : quản lý dữ liệu theo kiểu key và value(giống localStorge )
        Map<String, Book> map = new HashMap<>();
        // key là string, Book là đối tượng
        // Thêm phần tử vào trong map
        map.put("S1", new Book("B01", "Lập Trình C"));
        map.put("S2", new Book("B02", "Lập Trình php"));
        
        
        // Lấy phần tử trong map
        Book b = map.get("S1");
        if(b != null){
            System.out.println(b);
        } 
        b = map.get("S3");
        if(b != null){
            System.out.println(b);
        } else{
            System.out.println("Ko tim thay!!!!!! ");
        }
    }
}
