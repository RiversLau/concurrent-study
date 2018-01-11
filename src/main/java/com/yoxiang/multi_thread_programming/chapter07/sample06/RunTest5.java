package com.yoxiang.multi_thread_programming.chapter07.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/11 21:17
 */
public class RunTest5 {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("我的线程组");
        for (int i = 0; i < 5; i++) {
            MyThread mt = new MyThread(group, "线程" + (i + 1));
            mt.start();
        }
        Thread.sleep(5000);
        group.interrupt();
    }
}
