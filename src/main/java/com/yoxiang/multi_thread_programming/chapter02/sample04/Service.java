package com.yoxiang.multi_thread_programming.chapter02.sample04;

/**
 * Author: Rivers
 * Date: 2017/12/29 06:38
 */
public class Service {
    public synchronized void service1() {
        System.out.println("Service one");
        service2();
    }

    public synchronized void service2() {
        System.out.println("Service two");
        service3();
    }

    public synchronized void service3() {
        System.out.println("Service three");
    }
}
