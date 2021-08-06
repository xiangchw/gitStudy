package com.test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("HEllo World!");
        System.out.println(randomString());
        System.out.println("测试绑定一个问题追踪地址:");
        System.out.println("测试绑定一个问题追踪地址: 9041");
    }

    private static String randomString() {
        return String.valueOf(ThreadLocalRandom.current().nextDouble());
    }
}

