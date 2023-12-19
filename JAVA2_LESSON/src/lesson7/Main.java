/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        Scanner scan = new Scanner(System.in);
        
        int choose;
        
        do {     
            showMenu();
            choose = Utility.scanInt(scan);
            
            switch(choose){
                case 1: 
                    users.input();
                    break;
                case 2: 
                    System.out.println(users);
                    break;
                case 3: 
                    // lưu thông tin sinh viên vào database
                    UserModify.insert(users);
                    break;
                case 4: 
                    List<Users> userList = UserModify.getUserList();
                    for (Users u : userList) {
                        System.out.println(u);
                    }
                    break;
                case 5: 
                    System.out.println("Nhap username can xoa: ");
                    String username = scan.nextLine();
                    
                    UserModify.Delete(username);
                    break;
                case 6: 
                    System.out.println("Cap nhat thong tin sinh vien: ");
                    users.input();
                    UserModify.update(users);
                    break;
                case 7: 
                    break;
                default:
                    System.out.println("Nhập sai!! -> Nhập lại ");
                    break;
            }
        } while (choose != 7);
    }
    
    static void showMenu(){
        System.out.println("1.Hãy nhập thông tin sinh viên: ");
        System.out.println("2.Hiển thị thông tin sinh viên: ");
        System.out.println("3.Lưu thông tin sv vào database: ");
        System.out.println("4.đọc thông tin sv từ database: ");
        System.out.println("5.Xóa thông tin sv từ database: ");
        System.out.println("6.Cập nhật thông tin sv trong database: ");
        System.out.println("7.Thoát");
        System.out.println("Chọn");
    }
}
