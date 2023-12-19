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
public class Book {

    public String name;
    public String authorName;
    public float price;
    public String nxb;
    public String yearPublish;

    public Book() { // hàm tạo mặc định mục đích khởi tạo không gian dữ liệu cho các biến 
    }
    
    //Phần 2: vidu Tao 1 constructor -> Truyen gia tri cho name, price;
    public Book(String bookName, float bookPrice){
        name = bookName ;
        price= bookPrice;
    }
    
    //vd2: Tao ra 1 hàm tạo constructor -L> Truuyeenf tên , giá, authorname;
    public Book(String name, float price, String authorName){
        this.name = name ;
        this.price= price;
        this.authorName = authorName;
    }
    
    
    
    
    
    //end Phần 2;
    
    public void input(){
        System.out.println("Nhap du lieu cho cac thuoc tinh");
    }
    
    public void display(){
        System.out.println("Hien thi thong tin sach");
    }
    
    
}
