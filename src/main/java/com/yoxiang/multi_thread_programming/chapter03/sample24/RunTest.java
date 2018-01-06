package com.yoxiang.multi_thread_programming.chapter03.sample24;

/**
 * Author: Rivers
 * Date: 2018/1/6 17:00
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            ThreadA ta = new ThreadA();
            ta.start();
            Thread.sleep(1000);
            ThreadB tb = new ThreadB();
            tb.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
