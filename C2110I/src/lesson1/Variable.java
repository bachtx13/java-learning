/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson1;

/**
 *
 * @author admin
 */
public class Variable {
    public static void main(String[] args) {
        // kiểu dữ liệu danh sách tên biến
        int a; // khai báo biến kiểu số nguyên 
        int b= 5 ; // nếu mà khi khai báo , mình gán giá trị luôn cho nó thì gọi là KHỞI TẠO GIÁ TRỊ CHO BIẾN 
        int c, d,e, f; // khai báo nhiều biến trên 1 dòng 
        
//        - khuyến cáo tất cả các biến cục bộ nên khởi tạo giá trị mặc định:
//        + giá trị Mặc định  của số =0;
//        + giá trị Mặc định  của char = null;
        float PI = 3.141592f;
        char  k = 'U';
        boolean bool = true;
        
        float r=6.25f;
        float area = PI * r * r;
        
        System.out.println("circle area : " + area);
        
    }
}
