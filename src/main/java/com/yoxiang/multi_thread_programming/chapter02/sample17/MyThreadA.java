package com.yoxiang.multi_thread_programming.chapter02.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/2 20:31
 */
public class MyThreadA extends Thread {
    private MyOneList list;
    public MyThreadA(MyOneList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.addServiceMethod(list, "A");
    }
}
