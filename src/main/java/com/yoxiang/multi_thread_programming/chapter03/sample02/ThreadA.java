package com.yoxiang.multi_thread_programming.chapter03.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/5 06:37
 */
public class ThreadA extends Thread {

    private Object object;

    public ThreadA(Object object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        try {
            synchronized (object) {
                System.out.println("开始 begin time=" + System.currentTimeMillis());
                object.wait();
                System.out.println("结束 finish time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
