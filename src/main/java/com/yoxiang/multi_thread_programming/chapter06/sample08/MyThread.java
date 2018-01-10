package com.yoxiang.multi_thread_programming.chapter06.sample08;

/**
 * Author: Rivers
 * Date: 2018/1/10 20:59
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getConnection().hashCode());
        }
    }
}
