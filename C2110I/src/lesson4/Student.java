/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Student extends Citizen {

    String rollno, email;

    public Student() {
    }

    public Student(String rollno, String email, String fullName, String address, String cmtnd, int age) {
        super(fullName, address, cmtnd, age);
        this.rollno = rollno;
        this.email = email;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Yeu cau tuổi >= 0");
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập rollno: ");
        rollno = scan.nextLine();

        System.out.println("Nhập email: ");
        email = scan.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("\n rollo: %s, email: %s", rollno, email);
    }

    public void learning() {
        System.out.println(fullName + "dang hoc baiii!!!!!");
    }
    
    public void learning(String msg) {
        System.out.println(fullName + "dang hoc baiii!!!!!" + msg);
    }
}
