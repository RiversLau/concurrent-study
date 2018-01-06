package com.yoxiang.multi_thread_programming.chapter03.sample18;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:18
 */
public class RunTest2 {
    public static void main(String[] args) {
        try {
            MyThread mt = new MyThread();
            mt.start();
            mt.join();
            System.out.println("我想当MyThread对象执行完毕后我再执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
