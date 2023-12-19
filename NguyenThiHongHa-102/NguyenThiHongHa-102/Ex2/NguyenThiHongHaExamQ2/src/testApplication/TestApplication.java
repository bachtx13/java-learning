/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testApplication;

import entity.TestResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author std
 */
public class TestApplication {

    public static void main(String[] args) {
        int route;
        Scanner sc = new Scanner(System.in);
        List<TestResult> tList = new ArrayList<>();
        do {
            System.out.println("1. Input Test result list");
            System.out.println("2. Store TestResult");
            System.out.print("Enter your choose: ");
            route = sc.nextInt();
            switch (route) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        TestResult t = new TestResult();
                        t.input();
                        tList.add(t);
                    }
                    break;
                case 2:
                    File file = new File("test_result.obj");
                    try {
                        
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(tList);
                    } catch (Exception e) {
                    }

                    break;
                case 3:
                    System.out.println("Exit!!!");
                    break;

            }
        } while (route != 3);
    }
}
