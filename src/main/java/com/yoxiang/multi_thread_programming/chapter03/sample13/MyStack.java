package com.yoxiang.multi_thread_programming.chapter03.sample13;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:28
 */
public class MyStack {

    private List list = new ArrayList<>();

    public synchronized void push() {
        try {
            if (list.size() == 1) {
                this.wait();
            }
            list.add("anyString=" + Math.random());
            this.notify();
            System.out.println("push=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized String pop() {
        String returnValue = "";
        try {
            if (list.size() == 0) {
                this.wait();
            }
            returnValue = list.get(0) + "";
            list.remove(0);
            this.notify();
            System.out.println("pop=" + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
