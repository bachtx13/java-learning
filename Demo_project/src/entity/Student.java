/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author admin
 */
public class Student {
    private int roll_number;
    private int gender;
    private String name;
    private String dob;
    private String email;
    private String mobile;
    private String address;

    public Student() {
    }

    public Student(int roll_number, int gender, String name, String dob, String email, String moble, String address) {
        this.roll_number = roll_number;
        this.gender = gender;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMoible() {
        return mobile;
    }

    public void setMoible(String moble) {
        this.mobile = moble;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "roll_number=" + roll_number + ", gender=" + gender + ", name=" + name + ", dob=" + dob + ", email=" + email + ", mobile=" + mobile + ", address=" + address + '}';
    }
    
    
    
}
