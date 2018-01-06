package com.yoxiang.multi_thread_programming.chapter03.sample26;

import java.util.Date;

/**
 * Author: Rivers
 * Date: 2018/1/6 17:05
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    public Object initialValue() {
        return new Date().getTime();
    }
}
