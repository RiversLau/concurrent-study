package com.yoxiang.multi_thread_programming.chapter02.sample27;

/**
 * Author: Rivers
 * Date: 2018/1/3 06:55
 */
public class Service2 implements IService {

    Object obj = new Object();
    @Override
    public void methodA() {
        synchronized (obj) {
            System.out.println("method A begin");
            boolean isContinueRun = true;
            while (isContinueRun) {
            }
            System.out.println("method A finish");
        }
    }

    Object obj2 = new Object();
    @Override
    public void methodB() {
        synchronized (obj2) {
            System.out.println("method B begin");
            System.out.println("method B finish");
        }
    }
}
