package com.yoxiang.multi_thread_programming.chapter01.is_alive;

/**
 * Author: Rivers
 * Date: 2017/12/25 21:37
 */
public class RunTest2 {

    public static void main(String[] args) {
        CountOperateThread cot = new CountOperateThread();
        Thread thread = new Thread(cot);
        thread.setName("A");
        thread.start();
//        cot.start();
    }
}
