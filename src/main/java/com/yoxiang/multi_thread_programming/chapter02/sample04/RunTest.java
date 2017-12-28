package com.yoxiang.multi_thread_programming.chapter02.sample04;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:40
 */
public class RunTest {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
