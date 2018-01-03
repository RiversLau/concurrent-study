package com.yoxiang.multi_thread_programming.chapter02.sample35;

/**
 * Author: Rivers
 * Date: 2018/1/3 22:23
 */
public class RunTest {
    public static void main(String[] args) {
        try {
            RunThread rt = new RunThread();
            rt.start();
            Thread.sleep(1000);
            rt.setRunning(false);
            System.out.println("已赋值为false");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
