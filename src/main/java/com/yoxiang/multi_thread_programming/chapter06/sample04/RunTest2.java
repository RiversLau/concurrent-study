package com.yoxiang.multi_thread_programming.chapter06.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:42
 */
public class RunTest2 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();
        Thread2 t3 = new Thread2();
        t1.start();
        t2.start();
        t3.start();
    }
}
