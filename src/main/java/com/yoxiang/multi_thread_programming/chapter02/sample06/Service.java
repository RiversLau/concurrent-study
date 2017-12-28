package com.yoxiang.multi_thread_programming.chapter02.sample06;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:55
 */
public class Service {
    public synchronized void testMethod() {
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("Thread name = " + Thread.currentThread().getName() +
                        " run begintime = " + System.currentTimeMillis());
            int i = 1;
            while (i == 1) {
                if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
                    System.out.println("Thread name = " + Thread.currentThread().getName() +
                        " run exceptionTime = " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        } else {
            System.out.println("Thread B run time = " + System.currentTimeMillis());
            try {
                Thread.sleep(5000);
                System.out.println("Thread B run finish");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
