package com.yoxiang.multi_thread_programming.chapter07.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:35
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            synchronized (Lock.lock) {
                Lock.lock.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
