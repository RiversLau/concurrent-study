package com.yoxiang.multi_thread_programming.chapter02.sample36;

/**
 * Author: Rivers
 * Date: 2018/1/3 22:35
 */
public class MyThread extends Thread {

    public volatile static int count;
    private synchronized static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
