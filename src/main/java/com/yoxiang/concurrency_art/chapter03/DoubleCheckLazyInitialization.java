package com.yoxiang.concurrency_art.chapter03;

/**
 * 多线程情况依旧会出现问题，因为instance = new Instance();可以理解为如下三行代码
 * memory = allocate();
 * ctorInstance(memory);
 * instance = memory;
 * 第二行、第三行代码有可能会被重排序，也就是分配内存在前，初始化在后
 * 假设有两个线程A、B，其中B线程执行到程序中//7代码，线程A执行到//4代码，由于//7其实只是分配了内存，还没有
 * 初始化，那么线程A执行//4，得到false，那么线程A就会使用该对象，但是对象还没有初始化，所以线程将访问到尚未
 * 初始化的对象
 * @author: Rivers
 * @date: 2018/3/31
 */
public class DoubleCheckLazyInitialization {

    private static Instance instance;

    public static Instance getInstance() {
        //4
        if (instance == null) {
            //5
            synchronized (DoubleCheckLazyInitialization.class) {
                //6
                if (instance == null) {
                    //7
                    instance = new Instance();
                }
            }
        }
        return instance;
    }

    private static class Instance {
        private Instance() {

        }
    }
}
