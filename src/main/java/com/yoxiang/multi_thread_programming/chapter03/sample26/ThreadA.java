package com.yoxiang.multi_thread_programming.chapter03.sample26;

/**
 * Author: Rivers
 * Date: 2018/1/6 17:06
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadA=" + Tools.tl.get());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
