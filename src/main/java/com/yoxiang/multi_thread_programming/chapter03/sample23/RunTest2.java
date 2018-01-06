package com.yoxiang.multi_thread_programming.chapter03.sample23;

/**
 * Author: Rivers
 * Date: 2018/1/6 16:51
 */
public class RunTest2 {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        ThreadB tb = new ThreadB();

        ta.start();
        tb.start();

        try {
            for (int i = 0; i < 10; i++) {
                Tools.tl.set("Main" + (i + 1));
                System.out.println("Main get value=" + Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
