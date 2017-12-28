package com.yoxiang.multi_thread_programming.chapter02.sample05;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:45
 */
public class Parent {
    public int i = 10;
    public synchronized void operateIParentMethod() {
        try {
            i--;
            System.out.println("parent print i = " + i);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
