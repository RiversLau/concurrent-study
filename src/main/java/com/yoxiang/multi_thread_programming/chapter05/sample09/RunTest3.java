package com.yoxiang.multi_thread_programming.chapter05.sample09;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 22:32
 */
public class RunTest3 {

    public static void main(String[] args) {
        TaskA ta = new TaskA();
        Calendar cal = Calendar.getInstance();
        Date runDate = cal.getTime();
        System.out.println("当前时间=" + System.currentTimeMillis());
        Timer timer = new Timer();
        timer.schedule(ta, runDate, 2000);
    }

    static class TaskA extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
