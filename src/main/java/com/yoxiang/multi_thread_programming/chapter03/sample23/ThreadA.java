package com.yoxiang.multi_thread_programming.chapter03.sample23;

/**
 * Author: Rivers
 * Date: 2018/1/6 16:49
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Tools.tl.set("ThreadA-" + (i + 1));
                System.out.println("ThreadA get value=" + Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
