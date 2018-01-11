package com.yoxiang.multi_thread_programming.chapter07.sample11;

/**
 * Author: Rivers
 * Date: 2018/1/11 22:33
 */
public class MyThread extends Thread {
    private String num;
    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while (true) {
            System.out.println("死循环：" + Thread.currentThread().getName());
        }
    }
}
