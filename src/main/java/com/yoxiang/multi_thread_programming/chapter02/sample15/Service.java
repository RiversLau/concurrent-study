package com.yoxiang.multi_thread_programming.chapter02.sample15;

/**
 * Author: Rivers
 * Date: 2018/1/2 06:37
 */
public class Service {

    private String anyString = new String();

    public void methodA() {
        try {
            synchronized (anyString) {
                System.out.println("method A begin");
                Thread.sleep(2000);
                System.out.println("method A finish");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB() {
        System.out.println("method B begin");
        System.out.println("method B finish");
    }
}
