package com.yoxiang.multi_thread_programming.chapter03.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/5 06:41
 */
public class RunTest3 {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA ta = new ThreadA(lock);
            ta.setName("A");
            ta.start();
            Thread.sleep(2000);
            ThreadB tb = new ThreadB(lock);
            tb.setName("B");
            tb.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
