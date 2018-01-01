package com.yoxiang.multi_thread_programming.chapter02.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:05
 */
public class LongTask {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("un synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        }

        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }
}
