package com.yoxiang.multi_thread_programming.chapter01.stop_thread3;

/**
 * Author: Rivers
 * Date: 2017/12/27 06:43
 */
public class RunTest2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        mt.start();
        mt.interrupt();
        System.out.println("main finish");
    }
}
