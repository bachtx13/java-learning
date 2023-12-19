/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

import static lesson5.MultiThreadTest01.count;

/**
 *
 * @author admin
 */
public class ShareData {
    int count = 0;
    
    public synchronized void addMore(int delta, boolean isAdd){
        if(isAdd){
            plus(delta);
        }else{
            minus(delta);
        }
    }
    public void plus(int delta) {
        System.out.println("Before: " + count + ", delta" + delta);
        count += delta;
        System.out.println("After: " + count);
    }

    public void minus(int delta) {
        System.out.println("~~~Before: " + count + ", delta" + delta);
        count -= delta;
        System.out.println("~~~After: " + count);
    }
}
