package com.yoxiang.multi_thread_programming.chapter02.sample08;

/**
 * Author: Rivers
 * Date: 2018/1/1 18:05
 */
public class LongTask {
    private String getData1;
    private String getData2;
    public synchronized void doLongTimeTask() {
        try {
            System.out.println("Begin Task");
            Thread.sleep(3000);
            getData1 = "长时间处理任务从远程返回的值1 threadName=" + Thread.currentThread().getName();
            getData2 = "长时间处理任务从远程返回的值2 threadName=" + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("End Task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
