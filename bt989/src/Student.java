
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
public class Student extends Person {

    String rollNo;
    float mark;
    String email;

    public Student(String name, String gender, String address, int birthday) {
        super(name, gender, address, birthday);
    }

    Student() {
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        
        if( rollNo.length() == 8){
            this.rollNo = rollNo;
            return true;
        }else{
            System.out.println("Nhaap sai =>> Nhap lai");
        }
        return false;
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.out.println("Nhập sai!!! => Yêu cầu nhập lại(0 -> 10)");
        }
        return false;

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
            return true;
        } else {
            System.out.println("Nhap sai format...");
        }
        return false;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter RollNo of Student: ");
        rollNo = scan.nextLine();

        System.out.println("Enter Mark of Student: ");
        while (!setMark(Float.parseFloat(scan.nextLine()))) {
            System.out.println("Nhap Lai Mark");
        }

        System.out.println("Enter Email of Student: ");
        while (true) {
            String inputEmail = scan.nextLine();
            if (setEmail(inputEmail)) {
                break;
            }
            System.out.println("Nhap lai");
        }

    }

    @Override
    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", scores=" + mark + ", email=" + email + '}';
    }

    public boolean checkCerfiticate() {
        if (mark >= 8) {
            return true;
        }
        return false;
    }

}
