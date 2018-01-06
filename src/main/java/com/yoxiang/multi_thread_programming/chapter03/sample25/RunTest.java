package com.yoxiang.multi_thread_programming.chapter03.sample25;

/**
 * Author: Rivers
 * Date: 2018/1/6 17:03
 */
public class RunTest {
    public static void main(String[] args) {
        ThreadLocalExt tl = new ThreadLocalExt();
        if (tl.get() == null) {
            System.out.println("Never set");
            tl.set("Hello World");
        }
        System.out.println(tl.get());
    }
}
