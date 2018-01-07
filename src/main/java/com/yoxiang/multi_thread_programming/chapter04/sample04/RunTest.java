package com.yoxiang.multi_thread_programming.chapter04.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:31
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            ThreadA ta = new ThreadA(service);
            ta.start();
            Thread.sleep(5000);
            service.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
