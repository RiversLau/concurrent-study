package com.yoxiang.multi_thread_programming.chapter04.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/8 21:55
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
        Thread.sleep(1000);
        service.notifyMethod();
    }
}
