package com.yoxiang.multi_thread_programming.chapter04.sample08;

/**
 * Author: Rivers
 * Date: 2018/1/8 21:11
 */
public class RunTest {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread [" + Thread.currentThread().getName() + "] running");
                service.test();
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread ta = new Thread(runnable);
            ta.start();
        }
    }
}
