/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Person;
import entity.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AnhTH
 */
public class StudentBo implements IMethod<Student> {

    private List<Student> list;

    public StudentBo() {
        list = new ArrayList<>();
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public int getIndex(String rollNumber) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getRollNumber().equalsIgnoreCase(rollNumber.trim())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean add() {
        Student student = new Student();
        student.input();
        return this.list.add(student);
    }

    @Override
    public void display() {
        if (this.list.isEmpty()) {
            System.out.println("List Student Empty!!!");
        }
        for (Student student : this.list) {
            student.display();
        }
    }

    @Override
    public boolean update(String rollNumber) {
        int index = getIndex(rollNumber);
        if (index >= 0) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter name: ");
            list.get(index).setName(scan.nextLine().trim());

            System.out.print("Enter gender: ");
            list.get(index).setGender(Boolean.valueOf(scan.nextLine()));

            System.out.print("Enter dob (DD/MM/YY): ");
            list.get(index).setDob(scan.nextLine());

            System.out.print("Enter email: ");
            list.get(index).setEmail(scan.nextLine().trim());

            System.out.print("Enter mobile: ");
            list.get(index).setMobile(scan.nextLine().trim());

            System.out.print("Enter address: ");
            list.get(index).setAddress(scan.nextLine().trim());

            System.out.print("Enter Mark: ");
            list.get(index).setMark(Double.valueOf(scan.nextLine()));
            return true;
        }

        return false;
    }

    @Override
    public boolean remove(String rollNumber) {
        int index = getIndex(rollNumber);
        if (index >= 0) {
            return list.remove(index) != null;
        }
        return false;
    }

    @Override
    public void sort() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n1. Sort by roll number");
        System.out.println("2. Sort by name");
        System.out.println("3. Sort by mark");
        System.out.print("You choose: ");
        int flat = Integer.valueOf(scan.nextLine());

        switch (flat) {
            case 1:
                this.list.sort(Comparator.comparing(Student::getRollNumber));
                break;
            case 2:
                this.list.sort(Comparator.comparing(Student::getName));
                break;
            default:
                this.list.sort(Comparator.comparing(Student::getMark));
                break;
        }
        
    }

    @Override
    public List<Student> search(String text) {
        return null;
    }
    
    public void searchByName() {
//    Scanner scan = new Scanner(System.in);
//        System.out.println("nhap ten sinh vien can tim");
//        String studentName = scan.nextLine();
        for (Student student : list) {
            if (student.getName().toLowerCase().equalsIgnoreCase("a")) {
                student.display();
            }
        }
    }
}
