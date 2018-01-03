package com.yoxiang.multi_thread_programming.chapter02.sample35;

/**
 * Author: Rivers
 * Date: 2018/1/3 22:22
 */
public class RunThread extends Thread {

    private volatile boolean isRunning = true;
    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入Run了");
        while (isRunning) {
        }
        System.out.println("线程被停止了。");
    }
}
