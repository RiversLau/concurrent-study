package com.yoxiang.multi_thread_programming.chapter02.sample20;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:13
 */
public class MyObject {
    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPrintString __getLock time=" + System.currentTimeMillis() +
                    " run ThreadName=" + Thread.currentThread().getName());
            System.out.println("------------");
            System.out.println("speedPrintString __releaseLock time=" + System.currentTimeMillis() +
                    " run ThreadName=" + Thread.currentThread().getName());
        }
    }
}
