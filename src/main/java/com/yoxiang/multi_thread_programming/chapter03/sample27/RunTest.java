package com.yoxiang.multi_thread_programming.chapter03.sample27;

/**
 * Author: Rivers
 * Date: 2018/1/6 17:31
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main thread get value=" + Tools.tl.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA ta = new ThreadA();
            ta.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
