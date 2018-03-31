package com.yoxiang.concurrency_art.chapter03;

/**
 * @author: Rivers
 * @date: 2018/3/31
 */
public class SafeDoubleCheckLazyInitialization {

    private static volatile Instance instance;

    public static Instance getInstance() {
        if (instance == null) {
            synchronized (SafeDoubleCheckLazyInitialization.class) {
                if (instance == null) {
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
