package com.yoxiang.multi_thread_programming.chapter02.sample38;

/**
 * Author: Rivers
 * Date: 2018/1/4 06:49
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        CountService cs = new CountService();
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new MyThread(cs);
        }
        for (int i = 0; i < 5; i++) {
            threads[i].start();
        }
        Thread.sleep(1000);
        System.out.println(cs.count.get());
    }
}
