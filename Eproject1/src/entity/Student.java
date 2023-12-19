package entity;

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
public class Student {

    private String rollNumber;
    private String name;
    private boolean gender;
    private String dob;
    private String email;
    private String mobile;
    private String address;
    private double mark;

    public Student() {
    }

    
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap rollNomber: ");
        rollNumber = scan.nextLine();
        
        
        System.out.println("Nhap ten: ");
        name = scan.nextLine();

        System.out.println("Nhap dia chi: ");
        address = scan.nextLine();

        System.out.println("Nhap email: ");
        email = scan.nextLine();
        
        System.out.println("Nhap Date of : ");
        dob = scan.nextLine();
        
        System.out.println("Nhap So dien thoai  : ");
        mobile = scan.nextLine();
        
        System.out.println("Nhap Mark  : ");
        mark = scan.nextDouble();
        
        
        

    }

    public void display() {
        System.out.printf("rollNumber: %s, ten: %s, dia chi: %s,email: %s,dob: %s, mark : %f \n",rollNumber, name, address, email, dob, mark);
    }
    

}
