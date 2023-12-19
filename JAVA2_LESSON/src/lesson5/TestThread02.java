/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

/**
 *
 * @author admin
 */
public class TestThread02 extends Thread {

    boolean isAdd = false;
    ShareData shareData;

    public TestThread02(ShareData shareData, boolean isAdd) {
        this.isAdd = isAdd;
        this.shareData = shareData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            synchronized (shareData) {
                if (isAdd) {
                    shareData.plus(1);
                } else {
                    shareData.minus(1);
                }
            }
        }
    }

}
