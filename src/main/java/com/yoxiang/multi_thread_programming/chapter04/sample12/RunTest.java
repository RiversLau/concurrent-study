package com.yoxiang.multi_thread_programming.chapter04.sample12;

/**
 * Author: Rivers
 * Date: 2018/1/8 21:49
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

        Thread ta = new Thread(runnable);
        ta.start();
        Thread.sleep(500);
        Thread tb = new Thread(runnable);
        tb.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(tb));
        System.out.println(service.lock.hasQueuedThread(ta));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
