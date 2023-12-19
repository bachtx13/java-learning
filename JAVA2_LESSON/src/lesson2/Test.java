/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Test {

    public static void main(String[] args) {
        //Tim hieu ve Generic
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(3);

        int t = a1.get(0);
        
        ArrayList<String> a2= new ArrayList<>();
        a2.add("S1");
        a2.add("S2");
        
        String k = a2.get(0);
        System.out.println(k);
        
        // Câu 1 : arrayList Integer và arrayList String chỉ có 1 lớp đối tượng 
        //Câu 2: arrayList Integer tại sao k thêm đc string
         // t1:dựa vào integer và string 
         // t2: 
         
         
         ///Tesstcon
         Datacontrolier<Book> datacontrolier = new Datacontrolier<>();
         datacontrolier.add(new Book("1","Lap trinh C"));
         datacontrolier.add(new Book("2","Lap trinh D"));
         datacontrolier.add(new Book("3","Lap trinh E"));
         
         datacontrolier.showData();
    }
}
