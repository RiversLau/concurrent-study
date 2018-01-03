package com.yoxiang.multi_thread_programming.chapter02.sample38;

/**
 * Author: Rivers
 * Date: 2018/1/4 06:47
 */
public class MyThread extends Thread {

    private CountService countService;

    public MyThread(CountService countService) {
        this.countService = countService;
    }

    @Override
    public void run() {
        countService.count();
    }
}
