package com.yoxiang.multi_thread_programming.chapter06.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:25
 */
public class RunTest {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadA t2 = new ThreadA();
        ThreadA t3 = new ThreadA();

        t1.start();
        t2.start();
        t3.start();
    }
}
