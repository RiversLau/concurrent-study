package com.yoxiang.multi_thread_programming.chapter04.sample21;

/**
 * Author: Rivers
 * Date: 2018/1/9 06:37
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA ta = new ThreadA(service);
        ta.start();
        Thread.sleep(2000);
        ThreadB tb = new ThreadB(service);
        tb.start();
    }
}
