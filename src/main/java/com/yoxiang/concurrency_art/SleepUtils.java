package com.yoxiang.concurrency_art;

import java.util.concurrent.TimeUnit;

/**
 * @author: Rivers
 * @date: 2018/3/29
 */
public class SleepUtils {

    public static final void second(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
