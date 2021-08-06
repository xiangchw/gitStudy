package com.test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("HAllo World!");
        System.out.println(randomString());
    }

    private static String randomString() {
        return String.valueOf(ThreadLocalRandom.current().nextDouble());
    }
}

