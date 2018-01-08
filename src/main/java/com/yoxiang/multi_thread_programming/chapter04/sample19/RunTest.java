package com.yoxiang.multi_thread_programming.chapter04.sample19;

/**
 * Author: Rivers
 * Date: 2018/1/8 22:25
 */
public class RunTest {
    public static void main(String[] args) {
        final MyService ms = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " await, 时间为：" +
                        System.currentTimeMillis());
                ms.waitMethod();
            }
        };

        Thread ta = new Thread(runnable);
        ta.setName("A");
        ta.start();
        Thread tb = new Thread(runnable);
        tb.setName("B");
        tb.start();
    }
}
