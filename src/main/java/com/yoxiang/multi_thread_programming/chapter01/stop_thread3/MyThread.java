package com.yoxiang.multi_thread_programming.chapter01.stop_thread3;

/**
 * Author: Rivers
 * Date: 2017/12/27 06:34
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("在沉睡中被终止");
        }
    }
}
