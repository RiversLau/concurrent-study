package com.yoxiang.multi_thread_programming.chapter04.sample15;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:05
 */
public class RunTest {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.test();
            }
        };

        Thread ta = new Thread(runnable);
        ta.start();
    }
}
