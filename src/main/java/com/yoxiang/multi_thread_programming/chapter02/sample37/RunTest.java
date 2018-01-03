package com.yoxiang.multi_thread_programming.chapter02.sample37;

/**
 * Author: Rivers
 * Date: 2018/1/4 06:41
 */
public class RunTest {
    public static void main(String[] args) {
        CountService cs = new CountService();
        Thread t1 = new Thread(cs);
        t1.start();

        Thread t2 = new Thread(cs);
        t2.start();

        Thread t3 = new Thread(cs);
        t3.start();

        Thread t4 = new Thread(cs);
        t4.start();

        Thread t5 = new Thread(cs);
        t5.start();
    }
}
