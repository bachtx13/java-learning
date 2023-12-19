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
public class MultiThreadTest01 {

    static class TestThread extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                addMore(1);
            }
        }

    }

    static class TestThread01 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                addMore(1);
            }
        }

    }
//
//    static class TestThread02 extends Thread {
//
//    }

    public static void main(String[] args) {
//        TestThread t1 = new  TestThread(); // taoj luoong
//        TestThread t2 = new  TestThread();
//        TestThread t3 = new  TestThread();
//        
//        
//        t1.start();
//        t2.start();
//        t3.start();
        ShareData shareData = new ShareData();
        
        TestThread02 t1 = new TestThread02(shareData, true);
        TestThread02 t2 = new TestThread02(shareData,true);
        TestThread02 t3 = new TestThread02(shareData,false);
        TestThread02 t4 = new TestThread02(shareData,false);
        TestThread02 t5 = new TestThread02(shareData,false);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    // thuC HIỆN KIỂM TRA ĐA LUỒNG TRÊN  1 FUNCTION
    static void testSync01() {
        TestThread01 t1 = new TestThread01(); // taoj luoong
        TestThread01 t2 = new TestThread01();
        TestThread01 t3 = new TestThread01();

        t1.start();
        t2.start();
        t3.start();
    }
    //function
    static int count = 0;

    static synchronized void addMore(int delta) {
        System.out.println("Before: " + count + ", delta" + delta);
        count += delta;
        System.out.println("After: " + count);

    }

    // FUNCTION 01 
    
}
