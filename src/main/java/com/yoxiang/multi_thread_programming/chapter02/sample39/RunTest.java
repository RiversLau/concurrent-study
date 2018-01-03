package com.yoxiang.multi_thread_programming.chapter02.sample39;

/**
 * Author: Rivers
 * Date: 2018/1/4 07:00
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA ta = new ThreadA(service);
        ta.start();
        Thread.sleep(1000);

        ThreadB tb = new ThreadB(service);
        tb.start();
        System.out.println("已发出停止指令");
    }
}
