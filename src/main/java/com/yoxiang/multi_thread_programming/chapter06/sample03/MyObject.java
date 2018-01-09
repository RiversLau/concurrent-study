package com.yoxiang.multi_thread_programming.chapter06.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:30
 */
public class MyObject {
    private static MyObject instance;
    private MyObject() {}

    public static MyObject getInstance() {
        try {
            if (instance == null) {
                ThreadA.sleep(3000);
                instance = new MyObject();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
