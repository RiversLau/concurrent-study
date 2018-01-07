package com.yoxiang.multi_thread_programming.chapter04.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/7 21:37
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        ThreadA ta = new ThreadA(service);
        ta.setName("A");
        ta.start();
        ThreadAA taa = new ThreadAA(service);
        taa.setName("AA");
        taa.start();

        Thread.sleep(2000);

        ThreadB tb = new ThreadB(service);
        tb.setName("B");
        tb.start();
        ThreadBB tbb = new ThreadBB(service);
        tbb.setName("BB");
        tbb.start();
    }
}
