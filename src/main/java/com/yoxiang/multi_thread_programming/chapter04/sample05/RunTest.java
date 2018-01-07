package com.yoxiang.multi_thread_programming.chapter04.sample05;

/**
 * Author: Rivers
 * Date: 2018/1/8 06:40
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            MyService service = new MyService();
            ThreadA ta = new ThreadA(service);
            ta.start();
            ThreadB tb = new ThreadB(service);
            tb.start();

            Thread.sleep(2000);
            service.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
