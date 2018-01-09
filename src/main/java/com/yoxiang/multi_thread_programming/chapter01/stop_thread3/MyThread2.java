package com.yoxiang.multi_thread_programming.chapter01.stop_thread3;

/**
 * Author: Rivers
 * Date: 2017/12/27 06:40
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 300000; i++) {
                System.out.println("i = " + (i + 1));
            }
            System.out.println("Run Begin");
            Thread.sleep(200000);
            System.out.println("Run finish");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ThreadA interrupted!");
        }
    }
}
