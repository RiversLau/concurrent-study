package com.yoxiang.multi_thread_programming.chapter04.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/7 21:28
 */
public class RunTest {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread mt1 = new MyThread(service);
        MyThread mt2 = new MyThread(service);
        MyThread mt3 = new MyThread(service);
        MyThread mt4 = new MyThread(service);
        MyThread mt5 = new MyThread(service);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
    }
}
