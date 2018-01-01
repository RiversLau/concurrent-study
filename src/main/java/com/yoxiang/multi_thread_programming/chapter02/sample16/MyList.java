package com.yoxiang.multi_thread_programming.chapter02.sample16;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rivers
 * Date: 2018/1/2 06:55
 */
public class MyList {
    private List list = new ArrayList<>();
    public synchronized void add(String username) {
        System.out.println("Thread name=" + Thread.currentThread().getName() + " 执行Add方法");
        list.add(username);
        System.out.println("Thread name=" + Thread.currentThread().getName() + " 退出Add方法");
    }

    public synchronized int getSize() {
        System.out.println("Thread name=" + Thread.currentThread().getName() + " 执行getSize方法");
        int size = list.size();
        System.out.println("Thread name=" + Thread.currentThread().getName() + " 退出getSize方法");
        return size;
    }
}
