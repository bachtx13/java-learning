/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Users {
    String userName, email, password;

    public Users() {
    }
    
    public Users(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void input(){
        Scanner scan  = new Scanner(System.in);
        
        System.out.println("Nhap username: ");
        userName = scan.nextLine();
        
        System.out.println("Nhap email: ");
        email = scan.nextLine();
        
        System.out.println("Nhap password: ");
        password = scan.nextLine();
        
        
    }
    @Override
    public String toString() {
        return "Users{" + "userName=" + userName + ", email=" + email + ", password=" + password + '}';
    }
    
    
}
