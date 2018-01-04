package com.yoxiang.multi_thread_programming.chapter03.sample03;

/**
 * Author: Rivers
 * Date: 2018/1/4 21:41
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin time=" + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait finish time=" + System.currentTimeMillis());
                }
                System.out.println("运行B线程啦");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
