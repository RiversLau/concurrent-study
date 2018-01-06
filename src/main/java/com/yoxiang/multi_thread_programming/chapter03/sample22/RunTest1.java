package com.yoxiang.multi_thread_programming.chapter03.sample22;

/**
 * Author: Rivers
 * Date: 2018/1/6 16:26
 */
public class RunTest1 {
    public static void main(String[] args) {
        try {
            ThreadB tb = new ThreadB();

            ThreadA ta = new ThreadA(tb);
            ta.start();
            tb.start();
            tb.join(2000);
            System.out.println("main end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
