package com.yoxiang.concurrency_art.chapter01;

/**
 * Author: Rivers
 * Date: 2018/3/24 16:18
 */
public class DeadLock {

    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("Thread One");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    try {
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (A) {
                        System.out.println("Thread Two");
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
