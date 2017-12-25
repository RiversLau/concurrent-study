package com.yoxiang.multi_thread_programming.chapter01.current_thread;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:24
 */
public class RunTest3 {
    public static void main(String[] args) {
        CountOperateThread cot = new CountOperateThread();
        Thread thread = new Thread(cot);
        thread.setName("A");
        thread.start();
    }
}
