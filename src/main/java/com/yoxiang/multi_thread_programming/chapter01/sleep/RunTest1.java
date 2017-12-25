package com.yoxiang.multi_thread_programming.chapter01.sleep;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:51
 */
public class RunTest1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        System.out.println("begin = " + System.currentTimeMillis());
        mt.run();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
