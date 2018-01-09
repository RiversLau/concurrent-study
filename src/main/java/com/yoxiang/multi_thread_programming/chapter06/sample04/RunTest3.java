package com.yoxiang.multi_thread_programming.chapter06.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:46
 */
public class RunTest3 {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        Thread3 t2 = new Thread3();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}
