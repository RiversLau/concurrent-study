package com.yoxiang.multi_thread_programming.chapter02.sample16;

/**
 * Author: Rivers
 * Date: 2018/1/2 06:59
 */
public class MyThreadB extends Thread {

    private MyList list;
    public MyThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            list.add("thread-B-" + (i + 1));
        }
    }
}
