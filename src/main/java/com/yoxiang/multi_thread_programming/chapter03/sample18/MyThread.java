package com.yoxiang.multi_thread_programming.chapter03.sample18;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:15
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random() * 1000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
