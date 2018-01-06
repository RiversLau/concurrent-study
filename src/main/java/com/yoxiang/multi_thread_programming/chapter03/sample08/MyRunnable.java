package com.yoxiang.multi_thread_programming.chapter03.sample08;

/**
 * Author: Rivers
 * Date: 2018/1/6 09:10
 */
public class MyRunnable {

    static private Object lock = new Object();
    static private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin time=" + System.currentTimeMillis());
                    Thread.sleep(5000);
                    System.out.println("wait finish time=" + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread t = new Thread(runnable);
        t.start();
    }
}
