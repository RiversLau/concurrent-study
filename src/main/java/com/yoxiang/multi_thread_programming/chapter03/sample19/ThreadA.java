package com.yoxiang.multi_thread_programming.chapter03.sample19;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:24
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
