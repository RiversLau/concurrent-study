package com.yoxiang.multi_thread_programming.chapter06.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/10 07:01
 */
public class RunTest {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();
        t1.start();
        t2.start();
        t3.start();
    }
}
