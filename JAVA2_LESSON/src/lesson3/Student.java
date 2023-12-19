/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

/**
 *
 * @author admin
 */
public class Student {

    String fullname, gender, address, rollno;
    int age;

    public Student() {
    }

    public Student(String fullname, String gender, String address, String rollno, int age) {
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.rollno = rollno;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "fullname=" + fullname + ", gender=" + gender + ", address=" + address + ", rollno=" + rollno + ", age=" + age + '}';
    }

    public String getFileLine() {
        return  fullname + "," + gender + "," + address + "," + rollno + "," + age + "\n";

    }
    
    public void parseFileLine(String line){
        String[] params = line.split(",");
        fullname = params[0];
        gender = params[1];
        address = params[2];
        rollno = params[3];
        age =Integer.parseInt(params[4]);
                
    }
}
