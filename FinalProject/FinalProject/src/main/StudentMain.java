/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bo.StudentBo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AnhTH19
 */
public class StudentMain {

    private static String rollNumber;

    public static void main(String[] args) {
//        testFile();
        // test chuong trinh ghi file
//         saveFile();
        readFile();

        File file = new File("text.txt");
        if (file.exists()) {
            System.out.println("path" + file.getAbsolutePath());
        } else {
            System.out.println("file not exist");
            try {
                // tao file
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(StudentMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // test chuong trinh ghi file

        StudentBo studentBo = new StudentBo();
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("\n------- STUDENT MANAGE -------");
            System.out.println("1. Display list student");
            System.out.println("2. Add new student");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. Search");
            System.out.println("6. Sort");
            System.out.println("7. Save data");
            System.out.println("8. Load data");
            System.out.println("9. Exit");

            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            System.out.println("------------------------------");

            switch (choice) {
                case 1:
                    studentBo.display();
                    break;
                case 2:
                    studentBo.add();
                    System.out.println("Student list after adding");
                    studentBo.display();
                    break;
                case 3:
                    String rollNumber = scanner.nextLine();
                    studentBo.update(rollNumber);

                    break;
                case 4:
                    rollNumber = scanner.nextLine();
                    studentBo.remove(rollNumber);
                    break;
                case 5:
                    break;
                case 6:
                    studentBo.sort();
                    break;
                case 7:
                    studentBo.searchByName();
                    break;
                case 8:
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Only choose 1 - 9.");
            }
        } while (flag);

    }

    static void readFile() {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("vidu.txt");
            // doc noi dung chuong trinh
            int code = fis.read();
            System.out.println((char)code);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentMain.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(StudentMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }

    static void saveFile() {
        File file = new File("vidu.txt");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
//            byte 

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentMain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {// noi giai phong tai nguyen
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(StudentMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    static void testFile() {
        File file = new File("text.txt");
        if (file.exists()) {
            System.out.println("path" + file.getAbsolutePath());
        } else {
            System.out.println("file not exist");
            try {
                // tao file
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(StudentMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // test chuong trinh ghi file
    }
}
