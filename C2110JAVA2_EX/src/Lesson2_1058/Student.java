/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2_1058;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Student {
    String rollNo, Name, Sex, Email, Adress;
    int age;

    public Student() {
    }

    public Student(String rollNo, String Name, String Sex, String Email, String Adress, int age) {
        this.rollNo = rollNo;
        this.Name = Name;
        this.Sex = Sex;
        this.Email = Email;
        this.Adress = Adress;
        this.age = age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter rollNo : ");
        rollNo = scan.nextLine();
        
        System.out.println("Enter Name: ");
        Name = scan.nextLine();
        
        System.out.println("Enter Sex: ");
        Sex = scan.nextLine();
        
        System.out.println("Enter Age: ");
        age = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter Email: ");
        Email = scan.nextLine();
        
        System.out.println("Enter Address: ");
        Adress = scan.nextLine();
        
    }
    public void display(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", Name=" + Name + ", Sex=" + Sex + ", Email=" + Email + ", Adress=" + Adress + ", age=" + age + '}';
    }
    
}
