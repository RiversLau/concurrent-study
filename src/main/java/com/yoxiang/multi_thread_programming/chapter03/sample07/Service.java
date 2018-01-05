package com.yoxiang.multi_thread_programming.chapter03.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/5 21:37
 */
public class Service {

    public void testWait(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("method wait() begin, ThreadName [" + Thread.currentThread().getName() + "]");
                lock.wait();
                System.out.println("method wait() finish, ThreadName [" + Thread.currentThread().getName() + "]");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
