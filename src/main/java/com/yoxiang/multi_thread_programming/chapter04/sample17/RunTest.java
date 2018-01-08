package com.yoxiang.multi_thread_programming.chapter04.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:13
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
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
        Thread.sleep(500);

        Thread tb = new Thread(runnable);
        tb.setName("B");
        tb.start();
        tb.interrupt();
        System.out.println("main thread end");
    }
}
