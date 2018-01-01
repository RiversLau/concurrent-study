package com.yoxiang.multi_thread_programming.chapter02.sample09;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:18
 */
public class RunTest {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread mt1 = new MyThread(service);
        mt1.setName("One");
        mt1.start();
        MyThread mt2 = new MyThread(service);
        mt2.setName("Two");
        mt2.start();
    }
}
