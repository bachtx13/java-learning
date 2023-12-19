/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import account.AccountForm;
import dao.JDBCConnect;
import java.util.List;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        
        AccountForm accountForm = new AccountForm();
        
        List<AccountForm> AccountFormList = JDBCConnect.getAccountList();
                    for (AccountForm u : AccountFormList) {
                        System.out.println(u);
                    }
    }
}
