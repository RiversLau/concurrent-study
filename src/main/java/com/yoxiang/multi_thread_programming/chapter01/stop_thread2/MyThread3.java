package com.yoxiang.multi_thread_programming.chapter01.stop_thread2;

/**
 * Author: Rivers
 * Date: 2017/12/27 06:28
 */
public class MyThread3 extends Thread {
    @Override
    public void run() {
        super.run();

        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i = " + (i + 1));
            }
            System.out.println("此处位于for循环外面");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("捕捉到InterruptedException");
        }
    }
}
