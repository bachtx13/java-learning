/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2_1058;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Student> studentHashMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int choose;
        do {
            ShowMenu();
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Enter number Student: ");
                    int n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.input();
                        
                        studentHashMap.put(std.getRollNo(), std);
                    }
                    break;
                case 2:
                    System.out.println("thông tin sinh viên: ");
                    for (Map.Entry<String, Student> entry : studentHashMap.entrySet()) {
                        String key = entry.getKey();
                        Student value = entry.getValue();
                        value.display();
                    }
                    break;
                case 3:
                    System.out.println("Nhập rollno sinh viên: ");
                     String rollNo = scan.nextLine();
                     
                     Student stdFind = studentHashMap.get(rollNo);
                     stdFind.display();
                    break;
                default:
                    System.out.println("exit");
                    break;

            }
        } while (choose != 4);
    }

    static void ShowMenu() {
        System.out.println("1. Nhập N sinh viên");
        System.out.println("2. In thông tin sv");
        System.out.println("3. Tìm kiếm sinh viên (Yêu cầu nhập RollNo và hiển thị thông tin sv đó)");
        System.out.println("4.Exit");
        System.out.println("choose");
    }
}
