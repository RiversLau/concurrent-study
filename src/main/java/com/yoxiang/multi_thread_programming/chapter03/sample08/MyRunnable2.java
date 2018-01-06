package com.yoxiang.multi_thread_programming.chapter03.sample08;

/**
 * Author: Rivers
 * Date: 2018/1/6 09:12
 */
public class MyRunnable2 {
    static private Object lock = new Object();
    static private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin time=" + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait finish time=" + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin time=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify finish time=" + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) {
        try {
            Thread waitThread = new Thread(runnable);
            waitThread.start();
            Thread.sleep(3000);
            Thread notifyThread = new Thread(runnable2);
            notifyThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
