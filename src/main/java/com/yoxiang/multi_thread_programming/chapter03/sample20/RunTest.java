package com.yoxiang.multi_thread_programming.chapter03.sample20;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:33
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            MyThread mt = new MyThread();
            mt.start();
            // 将join换位sleep发现运行的结果是一样的，那么join与sleep的区别是什么呢？
            // 具体区别见sample21
//            mt.join(2000);
            Thread.sleep(2000);
            System.out.println("main end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
