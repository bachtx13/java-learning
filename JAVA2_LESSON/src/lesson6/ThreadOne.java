/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class ThreadOne extends Thread{
    ShareData sharedata;

    public ThreadOne(ShareData sharedata) {
        this.sharedata = sharedata;
    }

    @Override
    public void run() {
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            synchronized(sharedata){ // synchoronized đồng bộ luồng
                int rad = random.nextInt(100);
            sharedata.setRad(rad);
            
            System.out.println(rad);
            
            try {
                sharedata.notifyAll();
                // khi mà nó chạy xong thì mong muốn dừng lại
                sharedata.wait(); // thread tạm thời k chạy , -> tiếp tục chạy <=> notify(notifyAll)-> đánh thức thread-> tiếp tục chạy
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadOne.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        System.out.println("T1-stopp");
        // phải dùng cái này t1, t2 mới stop đc
        synchronized(sharedata){
            sharedata.notifyAll();
        }
    }
    
    
    
    
}
 