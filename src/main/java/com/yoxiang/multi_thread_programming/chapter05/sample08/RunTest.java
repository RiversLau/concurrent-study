package com.yoxiang.multi_thread_programming.chapter05.sample08;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:49
 */
public class RunTest {

    public static class TaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行，时间=" + new Date());
        }
    }

    public static void main(String[] args) {
        TaskA ta = new TaskA();
        Timer timer = new Timer();
        System.out.println("当前时间=" + new Date());
        timer.schedule(ta, 7000);
    }
}
