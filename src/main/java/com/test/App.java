package com.test;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("HAllo World!");
        System.out.println("rebase新增1");
        System.out.println("新特性1");
        System.out.println("master新增1");
        System.out.println(randomString());
        System.out.println("测试绑定一个问题追踪地址:");
        System.out.println("Master增加新功能!");
        System.out.println("Master测试冲突!");
        System.out.println("测试绑定一个问题追踪地址: 9041");
        System.out.println("rebase新增功能2");
        System.out.println("rebase测试冲突");
        System.out.println("master新增功能2");
        System.out.println("rebase新增功能3");
        System.out.println("rebase新增功能4");
        System.out.println("REBASE功能测试5");
        System.out.println("REBASE新增功能6");
        System.out.println("REBASE测试冲突");
        System.out.println("123-MASTER新增功能5");


        System.out.println("新功能");
    }

    private static String randomString() {
        return String.valueOf(ThreadLocalRandom.current().nextDouble());
    }
}

