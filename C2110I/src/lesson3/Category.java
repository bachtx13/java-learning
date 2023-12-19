/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Category {
    public String name;
    public ArrayList<Book> bookList;
    
     public void input(){
        System.out.println("Nhap du lieu cho cac thuoc tinh");
    }
    
    public void display(){
        System.out.println("Hien thi thong tin sach");
    }
}
