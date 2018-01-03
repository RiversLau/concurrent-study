package com.yoxiang.multi_thread_programming.chapter02.sample31;

/**
 * Author: Rivers
 * Date: 2018/1/3 21:39
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        MyService ms = new MyService();
        MyThread mt1 = new MyThread(ms);
        mt1.setName("A");
        mt1.start();
        MyThread mt2 = new MyThread(ms);
        mt2.setName("B");
        // 注意注释掉B后打印结果
//        Thread.sleep(50);
        mt2.start();
    }
}
