package com.yoxiang.multi_thread_programming.chapter06.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/10 20:49
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}
