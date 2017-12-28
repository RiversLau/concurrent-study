package com.yoxiang.multi_thread_programming.chapter02.sample05;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:47
 */
public class Child extends Parent {
    public synchronized void operateIChildMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("child print i =" + i);
                Thread.sleep(1000);
                this.operateIParentMethod();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
