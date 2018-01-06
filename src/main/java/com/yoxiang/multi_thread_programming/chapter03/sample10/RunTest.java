package com.yoxiang.multi_thread_programming.chapter03.sample10;

/**
 * Author: Rivers
 * Date: 2018/1/6 10:12
 */
public class RunTest {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("Hello");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);

        ThreadSubtract st1 = new ThreadSubtract(subtract);
        st1.setName("Subtract one");
        st1.start();

        ThreadSubtract st2 = new ThreadSubtract(subtract);
        st2.setName("Subtract two");
        st2.start();

        Thread.sleep(1000);

        ThreadAdd at = new ThreadAdd(add);
        at.start();
    }
}
