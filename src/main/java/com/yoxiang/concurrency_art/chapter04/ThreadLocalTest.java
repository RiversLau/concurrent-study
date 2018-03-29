package com.yoxiang.concurrency_art.chapter04;

import java.util.concurrent.TimeUnit;

/**
 * @author: Rivers
 * @date: 2018/3/29
 */
public class ThreadLocalTest {

    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>() {
        @Override
        protected Long initialValue() {
            return System.currentTimeMillis();
        }
    };

    public static void begin() {
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static long end() {
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalTest.begin();
        TimeUnit.SECONDS.sleep(5);
        System.out.println(ThreadLocalTest.end());
    }
}
