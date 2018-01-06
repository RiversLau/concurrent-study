package com.yoxiang.multi_thread_programming.chapter03.sample15;

import java.io.PipedInputStream;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:22
 */
public class ReadThread extends Thread {
    private ReadData read;
    private PipedInputStream input;
    public ReadThread(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
