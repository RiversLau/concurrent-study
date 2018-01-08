package com.yoxiang.multi_thread_programming.chapter04.sample24;

/**
 * Author: Rivers
 * Date: 2018/1/9 07:02
 */
public class RunTest {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA t1 = new ThreadA(service);
        t1.setName("A");
        t1.start();
        ThreadA t2 = new ThreadA(service);
        t2.setName("B");
        t2.start();
    }
}
