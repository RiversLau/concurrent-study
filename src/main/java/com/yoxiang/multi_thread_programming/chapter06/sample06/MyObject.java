package com.yoxiang.multi_thread_programming.chapter06.sample06;

import java.io.Serializable;

/**
 * Author: Rivers
 * Date: 2018/1/10 20:18
 */
public class MyObject implements Serializable {

    private MyObject() {}

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    protected Object readResolve() {
        return MyObjectHandler.myObject;
    }
}
