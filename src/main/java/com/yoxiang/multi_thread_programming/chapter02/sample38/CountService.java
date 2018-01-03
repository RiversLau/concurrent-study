package com.yoxiang.multi_thread_programming.chapter02.sample38;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Author: Rivers
 * Date: 2018/1/4 06:46
 */
public class CountService {

    public AtomicLong count = new AtomicLong();

    // 注意加synchronized与不加的区别
    public synchronized void count() {
        System.out.println(Thread.currentThread().getName() + " 加了100之后的值是：" + count.addAndGet(100));
        count.addAndGet(1);
    }
}
