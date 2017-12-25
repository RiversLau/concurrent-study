package com.yoxiang.multi_thread_programming.chapter01.current_thread;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:16
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("初始化线程：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Run 方法调用：" + Thread.currentThread().getName());
    }
}
