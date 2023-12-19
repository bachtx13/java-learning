
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
public class Person {
    String name, gender, address;
    int birthday;

    public Person() {
    }

    public Person(String name, String gender, String address, int birthday) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    
    public void inputInfo(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Name of Person: ");
        name = scan.nextLine();
        
        System.out.println("Enter Gender of Person: ");
        gender = scan.nextLine();
        
        System.out.println("Enter DateOfBirth of Person: ");
        birthday = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter Address of Person");
        address = scan.nextLine();
    }
    
    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", gender=" + gender + ", address=" + address + ", birthday=" + birthday + '}';
    }
    
}
