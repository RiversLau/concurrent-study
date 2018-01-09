package com.yoxiang.multi_thread_programming.chapter06.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:50
 */
public class RunTest4 {
    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        Thread4 t3 = new Thread4();
        t1.start();
        t2.start();
        t3.start();
    }
}
