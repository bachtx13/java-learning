/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class CustomThread extends Thread { // luồng sử dụng liên tiếp , tái sử dụng , thì tạp ra lớp khác

    @Override
    public void run() {
        System.out.println("Bắt đầu xử lý luồng mới!" + getName());
        
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000); // dừng luồng 1000 là 1 s
                System.out.println(getName()+"->"+ i);
            } catch (InterruptedException ex) {
                Logger.getLogger(CustomThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
