package com.yoxiang.multi_thread_programming.chapter06.sample02;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:27
 */
public class MyObject {
    private static MyObject instance;
    private MyObject() {
    }

    public static MyObject getInstance() {
        if (instance == null) {
            instance = new MyObject();
        }
        return instance;
    }
}
