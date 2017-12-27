package com.yoxiang.multi_thread_programming.chapter02.sample02;

/**
 * Author: Rivers
 * Date: 2017/12/28 07:00
 */
public class RunTest {

    public static void main(String[] args) {
        HasSelfPrivateNum privateNum = new HasSelfPrivateNum();
        MyThread1 mt1 = new MyThread1(privateNum);
        mt1.start();

        MyThread2 mt2 = new MyThread2(privateNum);
        mt2.start();
    }
}
