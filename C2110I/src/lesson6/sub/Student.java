/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.sub;

import lesson6.People;

/**
 *
 * @author admin
 */
public class Student extends People{
    String rollNo;

    public Student() {
    }
    
    public void hienthi(){
        System.out.println("name : " + name);
//        System.out.println("address : " + address);
//        System.out.println("age : " + age);
        System.out.println("rollNo : " + rollNo);
    }
}
