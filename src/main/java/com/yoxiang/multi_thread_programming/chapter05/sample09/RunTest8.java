package com.yoxiang.multi_thread_programming.chapter05.sample09;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 22:44
 */
public class RunTest8 {

    public static void main(String[] args) {
        MyTaskA mta = new MyTaskA();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(mta, 3000, 2000);
    }

    static class MyTaskA extends TimerTask {
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
