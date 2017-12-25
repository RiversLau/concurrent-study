package com.yoxiang.multi_thread_programming.chapter01.current_thread;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:21
 */
public class CountOperateThread extends Thread {

    public CountOperateThread() {
        System.out.println("CountOperate--begin");
        System.out.println("current thread name = " + Thread.currentThread().getName());
        System.out.println("get name = " + this.getName());
        System.out.println("CountOperate--end");
    }

    @Override
    public void run() {
        System.out.println("Run--begin");
        System.out.println("current thread name = " + Thread.currentThread().getName());
        System.out.println("get name = " + this.getName());
        System.out.println("Run--end");
    }
}
