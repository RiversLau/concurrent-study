package com.yoxiang.multi_thread_programming.chapter02.sample28;

/**
 * Author: Rivers
 * Date: 2018/1/3 20:56
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            DeadThread dt = new DeadThread();
            dt.setFlag("a");
            Thread t1 = new Thread(dt);
            t1.start();
            Thread.sleep(1000);
            dt.setFlag("b");
            Thread t2 = new Thread(dt);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
