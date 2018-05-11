package com.yoxiang.concurrency_interview;

/**
 * @author: Rivers
 * @date: 2018/5/11
 */
public class WaitNotifyTest {

    public static void main(String[] args) throws InterruptedException {
        final Object obj = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();
                        System.out.println("Thread t1 run");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        System.out.println("Start Thread t1");
        Thread.sleep(10000);
        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (obj) {
                    obj.notifyAll();
                    System.out.println("Thread t2 run");
                }
            }
        };
        t2.start();
        System.out.println("Start Thread t2");
        Thread.sleep(100000);
    }
}
