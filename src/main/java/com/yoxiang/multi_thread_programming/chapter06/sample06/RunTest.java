package com.yoxiang.multi_thread_programming.chapter06.sample06;

import java.io.*;

/**
 * Author: Rivers
 * Date: 2018/1/10 20:19
 */
public class RunTest {

    private static final String PREFIX = "/Users/Rivers/Develop/yoxiang/concurrent-study" +
            "/src/main/java/com/yoxiang/multi_thread_programming/chapter06/sample06/";

    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fos = new FileOutputStream(new File(PREFIX + "mos_file.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(myObject);
            oos.close();
            fos.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(PREFIX + "mos_file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyObject myObject = (MyObject) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
