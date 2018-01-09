package com.yoxiang.multi_thread_programming.chapter06.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:48
 */
public class MyObject4 {
    private volatile static MyObject4 instance;
    private MyObject4() {
    }

    // 使用DCL双检查机制保证实例唯一
    public static MyObject4 getInstance() {
        try {
            if (instance == null) {
                Thread.sleep(3000);
                synchronized (MyObject4.class) {
                    if (instance == null) {
                        instance = new MyObject4();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
