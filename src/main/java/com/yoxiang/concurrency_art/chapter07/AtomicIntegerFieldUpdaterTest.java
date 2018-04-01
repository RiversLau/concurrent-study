package com.yoxiang.concurrency_art.chapter07;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class AtomicIntegerFieldUpdaterTest {

    private static AtomicIntegerFieldUpdater<User> aifu = AtomicIntegerFieldUpdater.newUpdater(User.class, "age");

    public static void main(String[] args) {
        User rivers = new User("Rivers", 28);
        System.out.println(aifu.getAndIncrement(rivers));
        System.out.println(aifu.get(rivers));
    }

    public static class User {
        private String name;
        public volatile int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
