
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
    private String rollNo ;
    private String name;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(String rollNo, String name, int age, double mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", mark=" + mark + '}';
    }

    
    void input() {
        Scanner scanner = new Scanner(System.in);
        this.rollNo = scanner.nextLine();
        this.name = scanner.nextLine();
        this.age = scanner.nextInt();
        this.mark = scanner.nextDouble();
    }

    void add(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
