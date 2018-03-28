package com.yoxiang.concurrency_interview;

import java.util.concurrent.locks.Lock;

/**
 * @author: Rivers
 * @date: 2018/3/28
 */
public class TwinsLockTest {

    public static void main(String[] args) {

        final Lock lock = new TwinsLock();

        class Worker extends Thread {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        Thread.sleep(2);
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(2);
                    } catch (Exception ex) {
                      // do nothing
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            Worker w = new Worker();
            w.setDaemon(true);
            w.start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
                System.out.println("=================");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
