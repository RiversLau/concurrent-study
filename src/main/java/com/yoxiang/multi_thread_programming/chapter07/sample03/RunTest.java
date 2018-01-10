package com.yoxiang.multi_thread_programming.chapter07.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/11 06:30
 */
public class RunTest {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.setName("A");
        mt1.start();
        MyThread2 mt2 = new MyThread2();
        mt2.setName("B");
        mt2.start();
        System.out.println(mt2.getState());
    }
}
