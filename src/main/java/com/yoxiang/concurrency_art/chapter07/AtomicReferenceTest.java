package com.yoxiang.concurrency_art.chapter07;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: Rivers
 * @date: 2018/4/1
 */
public class AtomicReferenceTest {

    static AtomicReference<User> ar = new AtomicReference<>();

    public static void main(String[] args) {
        User user = new User("Hello", 15);
        ar.set(user);
        System.out.println(ar.get().getName() + ":" + ar.get().getAge());
        User newUser = new User("World", 20);
        ar.compareAndSet(user, newUser);
        System.out.println(ar.get().getName() + ":" + ar.get().getAge());
    }

    static class User {
        private String name;
        private int age;

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
