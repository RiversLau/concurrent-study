package com.yoxiang.multi_thread_programming.chapter04.sample18;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:20
 */
public class RunTest {
    public static void main(String[] args) {
        final MyService ms = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                ms.waitMethod();
            }
        };

        Thread ta = new Thread(runnable);
        ta.setName("A");
        ta.start();
        Thread tb = new Thread(runnable);
        tb.setName("B");
        tb.start();
    }
}
