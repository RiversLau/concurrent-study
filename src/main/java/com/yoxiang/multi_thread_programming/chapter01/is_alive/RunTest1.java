package com.yoxiang.multi_thread_programming.chapter01.is_alive;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:32
 */
public class RunTest1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        System.out.println("my thread is alive = " + mt.isAlive());
        mt.start();
//        ThreadA.sleep(1000);
        System.out.println("my thread is alive = " + mt.isAlive());
    }
}
