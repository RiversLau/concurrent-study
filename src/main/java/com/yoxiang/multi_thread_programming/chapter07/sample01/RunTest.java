package com.yoxiang.multi_thread_programming.chapter07.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:21
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        System.out.println("main method before start [" + mt.getState() + "]");
        Thread.sleep(1000);
        mt.start();
        Thread.sleep(1000);
        System.out.println("main method after start [" + mt.getState() + "]");
    }
}
