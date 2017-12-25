package com.yoxiang.multi_thread_programming.chapter01.is_alive;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:34
 */
public class CountOperateThread extends Thread {

    public CountOperateThread() {
        System.out.println("init method -- begin");
        System.out.println("current thread name =" + Thread.currentThread().getName());
        System.out.println("current thread is alive = " + Thread.currentThread().isAlive());
        System.out.println("this thread name = " + this.getName());
        System.out.println("this thread is alive = " + this.isAlive());
        System.out.println("init method -- finish");
    }

    @Override
    public void run() {
        System.out.println("run method -- begin");
        System.out.println("current thread name = " + Thread.currentThread().getName());
        System.out.println("current thread is alive = " + Thread.currentThread().isAlive());
        System.out.println("this thread name = " + this.getName());
        System.out.println("this thread is alive = " + this.isAlive());
        System.out.println("run method -- finish");
    }
}
