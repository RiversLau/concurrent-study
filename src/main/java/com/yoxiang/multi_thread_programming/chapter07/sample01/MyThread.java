package com.yoxiang.multi_thread_programming.chapter07.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:18
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("MyThread init method, [" + Thread.currentThread().getName() + "] state is " +
                    Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("MyThread run method, [" + Thread.currentThread().getName() + "] state is " +
                Thread.currentThread().getState());
    }
}
