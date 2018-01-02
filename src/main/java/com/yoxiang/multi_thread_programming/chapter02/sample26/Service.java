package com.yoxiang.multi_thread_programming.chapter02.sample26;

/**
 * Author: Rivers
 * Date: 2018/1/3 06:32
 */
public class Service {
    public static void print(Object obj) {
        try {
            synchronized (obj) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
