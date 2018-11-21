package com.example.design.pattern.design_pattern.factory.singleton.lazysingleton;

import com.example.design.pattern.design_pattern.factory.singleton.lazysingleton.SingletonThread;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/21 22:02
 */
public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new SingletonThread());
        Thread thread2 = new Thread(new SingletonThread());
        thread1.start();
        thread2.start();
        System.out.println("----");
    }
}
