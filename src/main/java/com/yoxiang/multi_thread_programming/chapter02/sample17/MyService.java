package com.yoxiang.multi_thread_programming.chapter02.sample17;

/**
 * Author: Rivers
 * Date: 2018/1/2 20:30
 */
public class MyService {

    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}
