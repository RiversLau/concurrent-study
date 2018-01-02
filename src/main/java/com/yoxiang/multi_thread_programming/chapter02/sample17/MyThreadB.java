package com.yoxiang.multi_thread_programming.chapter02.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/2 20:32
 */
public class MyThreadB extends Thread {

    private MyOneList list;
    public MyThreadB(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.addServiceMethod(list, "B");
    }
}
