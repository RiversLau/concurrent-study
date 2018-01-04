package com.yoxiang.multi_thread_programming.chapter03.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/5 06:53
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            Object lock = new Object();

            ThreadB tb = new ThreadB(lock);
            tb.start();
            Thread.sleep(1000);
            ThreadA ta = new ThreadA(lock);
            ta.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
