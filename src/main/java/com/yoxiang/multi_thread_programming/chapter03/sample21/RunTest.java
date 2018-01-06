package com.yoxiang.multi_thread_programming.chapter03.sample21;

/**
 * Author: Rivers
 * Date: 2018/1/6 15:54
 */
public class RunTest {
    public static void main(String[] args) {
        // 测试ThreadA中，tb.join和Thread.sleep的不同
        try {
            ThreadB tb = new ThreadB();

            ThreadA ta = new ThreadA(tb);
            ta.start();
            Thread.sleep(1000);
            ThreadC tc = new ThreadC(tb);
            tc.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
