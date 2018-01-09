package com.yoxiang.multi_thread_programming.chapter06.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:37
 */
public class MyObject1 {
    private static MyObject1 instance;
    private MyObject1() {}

    // 使用同步方法获取单例
    public synchronized static MyObject1 getInstance() {
        try {
            if (instance == null) {
                Thread.sleep(3000);
                instance = new MyObject1();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
