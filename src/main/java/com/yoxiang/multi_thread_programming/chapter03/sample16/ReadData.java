package com.yoxiang.multi_thread_programming.chapter03.sample16;

import java.io.IOException;
import java.io.PipedReader;

/**
 * Author: Rivers
 * Date: 2018/1/6 13:30
 */
public class ReadData {
    public void readMethod(PipedReader reader) {
        System.out.println("Read:");
        try {
            char[] bytes = new char[20];
            int length = reader.read(bytes);
            while (length != -1) {
                String newDate = new String(bytes, 0, length);
                System.out.print(newDate);
                length = reader.read(bytes);
            }
            System.out.println();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
