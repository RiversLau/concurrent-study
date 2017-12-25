package com.yoxiang.multi_thread_programming.chapter01.current_thread;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:18
 */
public class RunTest2 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
//        myThread.run();
    }
}
