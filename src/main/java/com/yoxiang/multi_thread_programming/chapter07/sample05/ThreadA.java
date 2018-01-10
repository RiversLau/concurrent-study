package com.yoxiang.multi_thread_programming.chapter07.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:41
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
