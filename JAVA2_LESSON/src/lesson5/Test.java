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
public class Test {

    // Test ở đây để test luồng custom
    public static void main(String[] args) {
        // có 3 luồng , main t1, t2
         
        // SU DUNG luồng, trc het phai tao ra luoog như này
        System.out.println("vd: Main-> step-> 1");
        CustomThread t1 = new CustomThread();
        t1.setName("T1");

        System.out.println("vd: Main-> step-> 2");
        // khởi tạo
        CustomThread t2 = new CustomThread();
        System.out.println("vd: Main-> step-> 3");
        t2.setName("T2");
        System.out.println("vd: Main-> step-> 4");
        
        // bắt đầu luồng chạy 
        t1.start();
        try {
            t1.join(); // nối luồng t1 , vào luồng main
            // vì t1 đang ở luồng main , đâm ra nó lối vào luồng main
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Main->" + i);
        }
        System.out.println("Stop");
        
    }
}
