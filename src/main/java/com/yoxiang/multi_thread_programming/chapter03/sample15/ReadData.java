package com.yoxiang.multi_thread_programming.chapter03.sample15;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:17
 */
public class ReadData {
    public void readMethod(PipedInputStream in) {
        System.out.println("Read:");
        try {
            byte[] bytes = new byte[20];
            int length = in.read(bytes);
            while (length != -1) {
                String newData = new String(bytes, 0, length);
                System.out.print(newData);
                length = in.read(bytes);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
