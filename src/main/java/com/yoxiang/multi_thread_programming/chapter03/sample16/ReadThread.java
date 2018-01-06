package com.yoxiang.multi_thread_programming.chapter03.sample16;

import java.io.PipedReader;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:36
 */
public class ReadThread extends Thread {
    private ReadData read;
    private PipedReader reader;
    public ReadThread(ReadData read, PipedReader reader) {
        this.read = read;
        this.reader = reader;
    }

    @Override
    public void run() {
        read.readMethod(reader);
    }
}
