package com.yoxiang.multi_thread_programming.chapter02.sample16;

/**
 * Author: Rivers
 * Date: 2018/1/2 06:57
 */
public class MyThreadA extends Thread {
    private MyList list;
    public MyThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            list.add("thread-A-" + (i + 1));
        }
    }
}
