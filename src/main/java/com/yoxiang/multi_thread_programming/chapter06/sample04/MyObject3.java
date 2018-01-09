package com.yoxiang.multi_thread_programming.chapter06.sample04;

/**
 * Author: Rivers
 * Date: 2018/1/10 06:44
 */
public class MyObject3 {
    private static MyObject3 instance;
    private MyObject3() {}

    // 使用同步代码块，只同步重要代码，但是此方法无法解决多个实例的问题
    public static MyObject3 getInstance() {
        try {
            if (instance == null) {
                Thread.sleep(3000);
                synchronized (MyObject3.class) {
                    instance = new MyObject3();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return instance;
    }
}
