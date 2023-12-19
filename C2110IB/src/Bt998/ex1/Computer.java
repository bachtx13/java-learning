/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt998.ex1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Computer {

    String rollNo;
    boolean status;
    String describe;

    public Computer() {
    }

    public Computer(String rollNo, boolean Status, String describe) {
        this.rollNo = rollNo;
        this.status = Status;
        this.describe = describe;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void status() {
        if (status = true) {
            System.out.println("-- MT ON --");
        } else {
            System.out.println("-- MT OFF --");
        }
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập rollNo: ");
        rollNo = scan.nextLine();

        System.out.println("Nhập trạng thái MT");
        status = scan.nextBoolean();
        scan.nextLine();

        System.out.println("Mô tả máy tính: ");
        describe = scan.nextLine();

    }

    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Computer{" + "rollNo=" + rollNo + ", status=" + (this.status?"--MT ON--":"-MT OFF-" ) + ", describe=" + describe + '}';
    } 
    
}
