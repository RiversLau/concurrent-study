package com.yoxiang.multi_thread_programming.chapter07.sample13;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:51
 */
public class MyThread extends Thread {
    private String num = "a";
    public MyThread() {
        super();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int parsed = Integer.parseInt(num);
        System.out.println("线程输出" + (parsed + 1));
    }
}
