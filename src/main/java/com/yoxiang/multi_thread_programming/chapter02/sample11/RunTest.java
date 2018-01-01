package com.yoxiang.multi_thread_programming.chapter02.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:31
 */
public class RunTest {
    public static void main(String[] args) {
        LongTask task = new LongTask();
        MyThread mt1 = new MyThread(task);
        mt1.setName("AAA");
        mt1.start();

        MyThread mt2 = new MyThread(task);
        mt2.setName("BBB");
        mt2.start();
    }
}
