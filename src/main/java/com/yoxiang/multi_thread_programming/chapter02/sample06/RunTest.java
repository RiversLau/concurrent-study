package com.yoxiang.multi_thread_programming.chapter02.sample06;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:59
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyThreadA threadA = new MyThreadA(service);
        threadA.setName("a");
        threadA.start();
        Thread.sleep(500);

        MyThreadA threadB = new MyThreadA(service);
        threadB.setName("b");
        threadB.start();
    }
}
