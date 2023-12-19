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
public class Citizen implements IRunning{
    String fullName, address, cmtnd;
    int age; 

    public Citizen() {
    }

    public Citizen(String fullName, String address, String cmtnd, int age) {
        this.fullName = fullName;
        this.address = address;
        this.cmtnd = cmtnd;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCmtnd() {
        return cmtnd;
    }

    public void setCmtnd(String cmtnd) {
        this.cmtnd = cmtnd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("Yeu cau tuổi >= 0");
        }
        
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        fullName = scan.nextLine();
        
        System.out.println("Nhap Địa chỉ: ");
        address = scan.nextLine();
        
        System.out.println("Nhập CMTND: ");
        cmtnd = scan.nextLine();
        
        System.out.println("Nhap Tuổi: ");
        setAge(Integer.parseInt(scan.nextLine()));
    }
    
    public void display(){
        System.out.printf("\nTen: %s,age: %d, dia chi : %s, cmtnd: %s", fullName, age, address, cmtnd);
    }
    @Override
    public void running(){
        System.out.println("Citizen running");
    }
    
    
}
