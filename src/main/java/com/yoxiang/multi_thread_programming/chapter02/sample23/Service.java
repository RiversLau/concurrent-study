package com.yoxiang.multi_thread_programming.chapter02.sample23;

/**
 * Author: Rivers
 * Date: 2018/1/2 22:26
 */
public class Service {
    public synchronized static void printA() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    " 在 " + System.currentTimeMillis() + " 进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() +
                    " 在 " + System.currentTimeMillis() + " 离开printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void printB() {
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                " 在 " + System.currentTimeMillis() + " 进入printB");
        System.out.println("线程名称为：" + Thread.currentThread().getName() +
                " 在 " + System.currentTimeMillis() + " 离开printB");
    }
}
