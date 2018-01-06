package com.yoxiang.multi_thread_programming.chapter03.sample22;

/**
 * Author: Rivers
 * Date: 2018/1/6 16:24
 */
public class ThreadA extends Thread {
    private ThreadB tb;
    public ThreadA(ThreadB tb) {
        this.tb = tb;
    }

    @Override
    public void run() {
        synchronized (tb) {
            try {
                System.out.println("thread A begin threadName=" + Thread.currentThread().getName() +
                        ", time=" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("thread A end threadName=" + Thread.currentThread().getName() +
                        ", time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
