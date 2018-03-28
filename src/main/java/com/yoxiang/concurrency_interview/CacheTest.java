package com.yoxiang.concurrency_interview;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author: Rivers
 * @date: 2018/3/28
 */
public class CacheTest {

    static Map<String, Object> map = new HashMap<>();

    static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    static Lock wLock = readWriteLock.writeLock();
    static Lock rLock = readWriteLock.readLock();

    public Object get(String key) {
        rLock.lock();
        try {
            return map.get(key);
        } finally {
            rLock.unlock();
        }
    }

    public void put(String key, Object value) {
        wLock.lock();
        try {
            map.put(key, value);
        } finally {
            wLock.unlock();
        }
    }

    public static void clear() {
        wLock.lock();
        try {
            map.clear();
        } finally {
            wLock.unlock();
        }
    }
}
