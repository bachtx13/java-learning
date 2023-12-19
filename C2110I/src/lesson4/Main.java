/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
//        Student std = new Student();
//        
//        std.input();
//        
//        std.setFullName("Test");
//        
//        std.display();
//        System.out.println("");

        //Tinh da hinh:
//        Citizen citizen = new Citizen();
//        citizen.input();
//        citizen.display();
//        Citizen c = new Student(); // goi la tính đa hình
//        c.input();
//        c.display();
//        // NHƯNG MÀ NẾU gọi c đến lớp learning thì lại bị lỗi 
//        // nên ngta sẽ call về Student
//        if (c instanceof Student) {
//            ((Student) c).learning();
//        }
        // ứng dụng tại sao phải sử dụng tính đa hình
        ArrayList<Citizen> list = new ArrayList<>();
//        ArrayList<Student> list2 = new ArrayList<>();

        //+ Quản lý nhập và hiển thị thông tin dữ liệu của Citizen và Student
        //+Bình thường sẽ tạo 2 bảng khác nhau như trên 
        // + có cách khác là sử dụng 1 mảng để quản lý 2 đối tượng trên
        //=>>> dùng tính đa hình
//        Citizen ci = new Citizen();
//        list.add(ci);
//
//        ci = new Student();
//        list.add(ci);
//
//        for (Citizen citizen : list) {
//            citizen.input();
//        }
//        
//        for (Citizen citizen : list) {
//            citizen.display();
//        }
        //cu phap lambda
        IRunning r1 = () -> {
            System.out.println("Testlabda");
        };
        r1.running();

        IAction action = new IAction() {
            @Override
            public void onRunning() {
                System.out.println("Test Running");
            }

            @Override
            public void onSleeping() {
                System.out.println("Test Sleeping");
            }
        };

        action.onRunning();
        action.onSleeping();

        // Khi nào sử dụng được lambda expression => với 1 interface
        IRunning r3 = () -> {
            System.out.println("Test 1.........");
            System.out.println("Test 2........");
        };

        // TH interface PT có chưa tham số 
        IMessage m1 = (msg) -> {
            System.out.println("Show message=>>" + msg);
        };
        m1.onMessage("123");

        //Hành Vi code
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(10);
        list1.add(11);

        list1.forEach((v) -> {
            System.out.println(v);
        });

        System.out.println("Stream=============");
        Stream t = list1.stream();
        t.forEach(System.out::println);
        
        System.out.println("Stream=============");
        // stream 
        //parallelStream dùng 2 luồng
        Stream t2 = list1.parallelStream();
        t2.forEach(System.out::println);
    }
}
