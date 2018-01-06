package com.yoxiang.multi_thread_programming.chapter03.sample23;

/**
 * Author: Rivers
 * Date: 2018/1/6 16:46
 */
public class RunTest {
    private static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) {
        if (tl.get() == null) {
            System.out.println("Never set");
            tl.set("Hello");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
