/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class ThreadTwo extends Thread {

    ShareData sharedata;

    public ThreadTwo(ShareData sharedata) {
        this.sharedata = sharedata;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(sharedata){
                try {
                sharedata.notifyAll();
                sharedata.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null, ex);
            }
            int rad = sharedata.getRad();
            System.out.println("Bt: " +(rad * rad));
            }
        }
        System.out.println("T2-stopp");
        // phải dùng cái này t1, t2 mới stop đc
        synchronized(sharedata){
            sharedata.notifyAll();
        }
    }
    
    
}
