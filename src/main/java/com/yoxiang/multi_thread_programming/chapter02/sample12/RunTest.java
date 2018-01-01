package com.yoxiang.multi_thread_programming.chapter02.sample12;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:42
 */
public class RunTest {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread1 mt1 = new MyThread1(service);
        mt1.start();

        MyThread2 mt2 = new MyThread2(service);
        mt2.start();
    }
}
