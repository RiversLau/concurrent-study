package com.yoxiang.multi_thread_programming.chapter01.stop_thread2;

/**
 * Author: Rivers
 * Date: 2017/12/27 06:25
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()) {
                System.out.println("已经是停止状态了！我要退出了！");
                break;
            }
            System.out.println("i = " + (i + 1));
        }
        System.out.println("线程已经停止了，但是此处依旧被执行了！");
    }
}
