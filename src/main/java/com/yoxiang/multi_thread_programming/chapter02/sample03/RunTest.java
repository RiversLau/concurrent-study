package com.yoxiang.multi_thread_programming.chapter02.sample03;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:22
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            MyThread mt = new MyThread(publicVar);
            mt.start();
            Thread.sleep(10000);
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
