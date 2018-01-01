package com.yoxiang.multi_thread_programming.chapter02.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/1 17:45
 */
public class RunTest {
    public static void main(String[] args) {
        Child child = new Child();
        MyThread mt1 = new MyThread(child);
        mt1.setName("One");
        mt1.start();

        MyThread mt2 = new MyThread(child);
        mt2.setName("Two");
        mt2.start();
    }
}
