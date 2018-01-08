package com.yoxiang.multi_thread_programming.chapter04.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/8 21:31
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
            Thread ta = new Thread(runnable);
            ta.start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
