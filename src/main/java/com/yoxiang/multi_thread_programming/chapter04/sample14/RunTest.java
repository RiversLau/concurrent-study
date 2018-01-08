package com.yoxiang.multi_thread_programming.chapter04.sample14;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:01
 */
public class RunTest {
    public static void main(String[] args) {
        final Service s1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                s1.test();
            }
        };
        Thread ta = new Thread(runnable);
        ta.start();

        final Service s2 = new Service(false);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                s2.test();
            }
        };
        Thread tb = new Thread(runnable1);
        tb.start();
    }
}
