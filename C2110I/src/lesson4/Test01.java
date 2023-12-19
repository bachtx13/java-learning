/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Test01 {
    // xây dựng 1 chương trình =>> dùng mảng array-> để quản lý tất cả đối tượng 
    //Animal (Dog, cat ,tigger), student , citizen  , car
    // Quản lý được các hành động runnin trong tat ca đối tượng trên 
    public static void main(String[] args) {
            ArrayList<IRunning> list = new ArrayList<>();
            
            IRunning r = new Dog();
            list.add(r);
            
             r = new Cat();
            list.add(r);
            
             r = new Citizen();
            list.add(r);
             r = new Student();
            list.add(r);
             r = new Car();
            list.add(r);
            
            
            for (IRunning rr : list) {
            rr.running();
                    
        }
    }
    
}
