
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class StudentTest {

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        do {
            showMenu();
            choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    inputStudent(studentList);
                    break;
                case 2:
                    displayStudent(studentList);
                    break;
                case 3:
                    showMinMax(studentList);
                    break;
                case 4:
                    searchStudent(studentList);
                    break;
                case 5:
                    displaySortByName(studentList);
                    break;
                case 6:
                    displayByCerfiticate(studentList);
                    break;
                case 7:
                    System.out.println("Thoat!!!!");
                    break;
                default:
                    System.out.println("Nhap Lai");
                    break;
            }
        } while (choose != 7);
        
    }
    
    static void showMenu() {
        System.out.println("1. Nhap Thong tin sinh vien: ");
        System.out.println("2. Hien Thi thong tin sinh vien: ");
        System.out.println("3. Hien thi sinh vien co diem cao nhat va thap nhat: ");
        System.out.println("4. Tim kiem theo ma sinh vien: ");
        System.out.println("5. Hien thi all sinh vien a-> z:");
        System.out.println("6. Hien Thi sinh vien dc hoc bonng tu cao -> thap: ");
        System.out.println("7. Thoat!!!");
        System.out.println("Chon: ");
    }
    
    static void inputStudent(ArrayList<Student> studentList) {
        System.out.println("Nhập số sinh viên cần thêm :");
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            std.inputInfo();
            
            studentList.add(std);            
        }
    }
    
    static void displayStudent(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            student.showInfo();
        }
    }
    
    static void showMinMax(ArrayList<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return 1;
                }                
                return -1;
            }            
        });
        System.out.println("Thong tin sinh viên điểm TB thấp nhất: ");
        studentList.get(0).showInfo();
        
        System.out.println("Thong tin sinh vien điểm TB cao nhất: ");
        studentList.get(studentList.size() - 1).showInfo();
        // gap -1 la se hoan ddoi vi tri , am hay duong deu dc
    }
    
    static void searchStudent(ArrayList<Student> studentList) {
        System.out.println("Nhap ma sinh vieen can tim: ");
        String rollnoSearch = scan.nextLine();
        
        boolean isFind = false;
        for (Student student : studentList) {
            if (student.getRollNo().equalsIgnoreCase(rollnoSearch)) {
                student.showInfo();
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.println(" Khong tim thay sinh vien vs roollno:" + rollnoSearch);
        }
    }
    
    static void displaySortByName(ArrayList<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
            
        });
        
        displayStudent(studentList);
    }
    
    static void displayByCerfiticate(ArrayList<Student> studentList) {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return -1;
                }
                return 1;
            }
            
        });
        
        for (Student student : studentList) {
            if(student.checkCerfiticate()){
                student.showInfo();
            }else{
                break;
            }
        }
        
    }
}
