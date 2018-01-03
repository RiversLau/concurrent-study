package com.yoxiang.multi_thread_programming.chapter02.sample32;

/**
 * Author: Rivers
 * Date: 2018/1/3 21:49
 */
public class Service {
    public void serviceMethodA(UserInfo userinfo) {
        synchronized (userinfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userinfo.setUsername("abcabc");
                Thread.sleep(3000);
                System.out.println("end! time=" + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
