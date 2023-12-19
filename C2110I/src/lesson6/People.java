/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author admin
 */
public class People {
    final String CLASS_NAME = "people";
    // khi ta khai báo biến trc final =>> CLASS_NAME gọi là hằng số và k  thay đổi
    static protected String name;
    String address;
    private int age; 

    public People() {
    }
    
    public void nhap(){
        System.out.println("Nhập dữ liệu: ");
    }
}
