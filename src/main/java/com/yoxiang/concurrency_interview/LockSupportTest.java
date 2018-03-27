package com.yoxiang.concurrency_interview;

import java.util.concurrent.locks.LockSupport;

/**
 * @author: Rivers
 * @date: 2018/3/27 22:17
 */
public class LockSupportTest {

    public static void main(String[] args) {

        LockSupport.unpark(Thread.currentThread());
        LockSupport.park();
        System.out.println("What is LockSupport? First Time!");
        LockSupport.park();
        System.out.println("What is LockSupport? Second Time!");
    }
}
