package com.yoxiang.multi_thread_programming.chapter04.sample25;

/**
 * Author: Rivers
 * Date: 2018/1/9 07:07
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        ThreadB tb = new ThreadB(service);
        tb.start();

        Thread.sleep(100);
        ThreadA ta = new ThreadA(service);
        ta.start();
    }
}
