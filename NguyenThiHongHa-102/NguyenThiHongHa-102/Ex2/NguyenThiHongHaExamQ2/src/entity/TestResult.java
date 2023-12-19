package entity;


import java.io.Serializable;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author std
 */
public class TestResult implements Serializable{

    private String testDate;
    private int testDuration;
    private String testRoom;
    private int totalStudent;
    

    public TestResult() {
    }

    public TestResult(String testDate, int testDuration, String testRoom, int totalStudent) {
        this.testDate = testDate;
        this.testDuration = testDuration;
        this.testRoom = testRoom;
        this.totalStudent = totalStudent;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public int getTestDuration() {
        return testDuration;
    }

    public void setTestDuration(int testDuration) {
        this.testDuration = testDuration;
    }

    public String getTestRoom() {
        return testRoom;
    }

    public void setTestRoom(String testRoom) {
        this.testRoom = testRoom;
    }

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    @Override
    public String toString() {
        return "TestResult{" + "testDate=" + testDate + ", testDuration=" + testDuration + ", testRoom=" + testRoom + ", totalStudent=" + totalStudent + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter test Date: ");
        this.testDate = sc.next();
        System.out.print("Enter test duration: ");
        this.testDuration = sc.nextInt();
        System.out.print("Enter test room: ");
        this.testRoom = sc.next();
        System.out.print("Enter total student: ");
        this.totalStudent = sc.nextInt();
    }

    public void display() {
        System.out.println("==========================================================================================");
        System.out.printf("%-20s||%-5d||%-10s||%-10d", this.testDate, this.testDuration, this.testRoom, this.totalStudent);
        System.out.println("");
    }
}
