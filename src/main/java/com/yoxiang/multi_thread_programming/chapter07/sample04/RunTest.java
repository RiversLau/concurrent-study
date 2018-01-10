package com.yoxiang.multi_thread_programming.chapter07.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:36
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();
        Thread.sleep(1000);
        System.out.println(mt.getState());
    }
}
