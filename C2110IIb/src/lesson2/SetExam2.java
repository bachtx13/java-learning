/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author admin
 */
public class SetExam2 {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<String>();
        Set<String> setB= new HashSet<String>();
        
        setB.add("Java");
        setB.add("Python");
        setB.add("Java");
        setB.add("Php");
        
        setA.addAll(setB);
        System.out.println("Số phần tử của setA" + setA.size());
        System.out.println("Các phần tử của setA" + setA);
        System.out.println("setA có chứa java không?" + setA.contains("Java"));
        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));
    }
}
