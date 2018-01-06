package com.yoxiang.multi_thread_programming.chapter03.sample19;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:24
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA ta = new ThreadA();
            ta.start();
            ta.join();
            System.out.println("线程B在run end处打印啦！");
        } catch (InterruptedException e) {
            System.out.println("线程B在catch处打印啦");
            e.printStackTrace();
        }
    }
}
