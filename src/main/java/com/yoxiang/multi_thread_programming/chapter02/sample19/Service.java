package com.yoxiang.multi_thread_programming.chapter02.sample19;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:06
 */
public class Service {
    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1 __getLock time=" + System.currentTimeMillis() +
                        " run ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1 __releaseLock time=" + System.currentTimeMillis() +
                        " run ThreadName=" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
