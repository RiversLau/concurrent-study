package com.yoxiang.multi_thread_programming.chapter01.stop_thread;

/**
 * Author: Rivers
 * Date: 2017/12/26 06:21
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 80000; i++) {
            System.out.println("i = " + (i + 1));
        }
    }
}
