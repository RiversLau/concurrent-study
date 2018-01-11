package com.yoxiang.multi_thread_programming.chapter07.sample06;

/**
 * Author: Rivers
 * Date: 2018/1/11 21:18
 */
public class MyThread extends Thread {
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName=" + Thread.currentThread().getName() + " 准备开始死循环");
        while (!this.isInterrupted()) {
        }
        System.out.println("ThreadName=" + Thread.currentThread().getName() + " 结束啦！");
    }
}
