package com.yoxiang.multi_thread_programming.chapter01.stop_thread;

/**
 * 调用interrupt方法并没有终止线程
 * Author: Rivers
 * Date: 2017/12/26 06:22
 */
public class RunTest1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        try {
            Thread.sleep(2000);
            mt.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
