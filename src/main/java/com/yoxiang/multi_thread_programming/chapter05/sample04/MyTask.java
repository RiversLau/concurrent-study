package com.yoxiang.multi_thread_programming.chapter05.sample04;

import java.util.Date;
import java.util.TimerTask;

/**
 * Author: Rivers
 * Date: 2018/1/9 21:22
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行，时间=" + new Date());
    }
}
