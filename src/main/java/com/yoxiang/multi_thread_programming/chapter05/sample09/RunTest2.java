package com.yoxiang.multi_thread_programming.chapter05.sample09;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 22:27
 */
public class RunTest2 {

    public static void main(String[] args) {
        TaskA ta = new TaskA();
        System.out.println("当前时间=" + System.currentTimeMillis());
        Timer timer = new Timer();
        timer.schedule(ta, 3000, 4000);
    }

    static class TaskA extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
