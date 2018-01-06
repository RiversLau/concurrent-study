package com.yoxiang.multi_thread_programming.chapter03.sample24;

import java.util.Date;

/**
 * Author: Rivers
 * Date: 2018/1/6 16:59
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set(new Date());
                }
                System.out.println("B==" + Tools.tl.get().getTime());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
