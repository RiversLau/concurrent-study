package com.yoxiang.multi_thread_programming.chapter02.sample27;

/**
 * Author: Rivers
 * Date: 2018/1/3 06:50
 */
public class Service implements IService {

    public synchronized void methodA() {
        System.out.println("method A begin");
        boolean isContinueRun = true;
        while (isContinueRun) {
        }
        System.out.println("method A finish");
    }

    public synchronized void methodB() {
        System.out.println("method B begin");
        System.out.println("method B finish");
    }
}
