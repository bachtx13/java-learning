
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
public class Employee {
    String Fullname, Gender, Address, Position; // chức vụ
    double Salary ; // tiền lương 

    public Employee() {
    }

    public Employee(String Fullname, String Gender, String Address, String Position, double Salary) {
        this.Fullname = Fullname;
        this.Gender = Gender;
        this.Address = Address;
        this.Position = Position;
        this.Salary = Salary;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    public void input(){
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter Full Name: ");
        Fullname = scan.nextLine();
        
        System.out.println("Enter Gender(male or female): ");
        Gender = scan.nextLine();
        
        System.out.println("Enter Adress: ");
        Address = scan.nextLine();
        
        System.out.println("Enter Position: ");
        Position = scan.nextLine();
        
        System.out.println("Enter Salary: ");
        Salary = Integer.parseInt(scan.nextLine()); 
    }
    
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Employee{" + "Fullname=" + Fullname + ", Gender=" + Gender + ", Address=" + Address + ", Position=" + Position + ", Salary=" + Salary + '}';
    }
    
    
}
