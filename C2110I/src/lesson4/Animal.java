/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author admin
 */
public abstract class Animal  implements IRunning{
    String name, color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void input(){
        System.out.println("Nhap thong tin Animail");
    }
    
    public void display(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + '}';
    }
    
    
    
    public abstract void showSound();// khi mà không có phần thân
    
    @Override
    public void running(){
        System.out.println("Animal running");
    }
}
