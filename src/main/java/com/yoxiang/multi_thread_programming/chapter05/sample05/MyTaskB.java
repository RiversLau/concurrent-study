package com.yoxiang.multi_thread_programming.chapter05.sample05;

import java.util.Date;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:31
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B run time=" + new Date());
    }
}
