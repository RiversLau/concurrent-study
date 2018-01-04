package com.yoxiang.multi_thread_programming.chapter03.sample01;

/**
 * Author: Rivers
 * Date: 2018/1/4 21:41
 */
public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (list.size() == 5) {
                    System.out.println("==5了，线程B要退出啦！");
                    throw new InterruptedException();
                }
                System.out.println("运行B线程啦");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
