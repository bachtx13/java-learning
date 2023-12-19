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
public class Main {
    public static void main(String[] args) {
        /*
        Phann 1 BASIC;
        */
        // Coi class book như 1 data type(custum data type) ->> sử dụng như int , float , double 
        // cách sử dụng hơi khách xíu 
        Book  b1 ; // đây là phần khai báo , Nhưng mà riêng kiểu dữ liệu là lớp đối tượng , mà chỉ khai báo book book
        // Book : class object ( lớp đối tượng )
        // b1 : object ( đối tượng)
        // book b1 ; mới khai báo , chưa  được khởi tạo , gtri null (chưa được cấp phát bộ nhớ);
        b1 = new Book(); // b1 mới được cấp phát bộ nhớ (là tạo ra không gian bộ nhớ để lưu dữ liệu )
        // new Book : là hàm tạo (constructor)
        
        b1.name= "Lập trình c ";
        b1.authorName="Tran Van A";
        b1.nxb ="Aptech";
//        b1.price =20000;
        b1.yearPublish ="2020";
        
        System.out.println("Name: " + b1.name);
        
        /*
        Phan 2: Y nghia conSTRUCTER
        */
        // dung den hàm tạo mới
        Book b2 = new Book("Lap trinh HTML/CSS/JS", 300000); 
        
        System.out.println("Name :" + b2.name);
        
        Book b3= new Book("SQL ", 2000, "Tran Van A");
        System.out.println("Name : " + b3.name);
    }
}
