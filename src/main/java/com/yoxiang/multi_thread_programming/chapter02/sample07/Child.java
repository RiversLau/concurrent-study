package com.yoxiang.multi_thread_programming.chapter02.sample07;

/**
 * Author: Rivers
 * Date: 2018/1/1 17:40
 */
public class Child extends Parent {

    @Override
    public void serviceMethod() {
        try {
            System.out.println("child method next step sleep begin threadName=" +
                    Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("child method next step end threadName=" +
                    Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
