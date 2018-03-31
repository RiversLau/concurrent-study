package com.yoxiang.concurrency_art.chapter03;

/**
 * @author: Rivers
 * @date: 2018/3/31
 */
public class SafeLazyInitialization {

    private static Instance instance;

    public synchronized static Instance getInstance() {
        if (instance == null) {
            instance = new Instance();
        }
        return instance;
    }

    private static class Instance {
        private Instance() {

        }
    }
}
