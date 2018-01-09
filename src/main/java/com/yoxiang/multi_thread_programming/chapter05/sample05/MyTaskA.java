package com.yoxiang.multi_thread_programming.chapter05.sample05;

import java.util.Date;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:30
 */
public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run time=" + new Date());
        this.cancel();
        System.out.println("A 移除自己");
    }
}
