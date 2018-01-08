package com.yoxiang.multi_thread_programming.chapter04.sample20;

/**
 * Author: Rivers
 * Date: 2018/1/9 06:29
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.test();
            }
        };

        Thread ta = new Thread(runnable);
        ta.start();
        Thread.sleep(3000);
        ta.interrupt();
    }
}
