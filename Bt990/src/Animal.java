
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
public abstract class Animal {
    String name;
    int age;
    String description;

    public Animal() {
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void input(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap vao tên Animal: ");
        name = scan.nextLine();
        
        System.out.println("Nhap vao Tuổi Animal:");
        setAge(Integer.parseInt(scan.nextLine()));
        
        System.out.println("Mô tả Animal: ");
        description = scan.nextLine();
    }
    
    public void display(){
        System.out.printf(toString());
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + ", description=" + description + '}';
    }
    
    
    
    public abstract void showSound();
}
