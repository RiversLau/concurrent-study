package com.yoxiang.multi_thread_programming.chapter06.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:41
 */
public class MyObject2 {
    private static MyObject2 instance;
    private MyObject2() {}

    // 使用同步代码块
    public static MyObject2 getInstance() {
        try {
            synchronized (MyObject2.class) {
                if (instance == null) {
                    Thread.sleep(3000);
                    instance = new MyObject2();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
