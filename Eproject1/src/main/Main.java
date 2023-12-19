/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Student;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
//        Student std = new Student();      
        for (int i = 0; i < 5; i++) {
            Student std = new Student(); 
            std.input();
            std.display();
        }
    }
}
