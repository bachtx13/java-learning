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
public class SetExam {

    public static void main(String[] args) {
        Set<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("Php");
        System.out.println("Số phần tử của setA" + setA.size());
        System.out.println("Các phần tử của setA" + setA);
        System.out.println("setA có chứa java không?" + setA.contains("Java"));
        System.out.println("setA có chứa C++ không? " + setA.contains("C++"));
    }
}
