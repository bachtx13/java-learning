/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author admin
 */
public class AccountForm {
    String username,password;

    public AccountForm() {
    }

    public AccountForm(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AccountForm{" + "userName=" + username + ", password=" + password + '}';
    }
    
    
}
