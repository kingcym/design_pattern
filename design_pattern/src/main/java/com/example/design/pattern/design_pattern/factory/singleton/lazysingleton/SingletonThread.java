package com.example.design.pattern.design_pattern.factory.singleton.lazysingleton;

import com.example.design.pattern.design_pattern.factory.singleton.lazysingleton.LazySingleton;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/21 22:03
 */
public class SingletonThread implements Runnable {
    @Override
    public void run() {
        LazySingleton instance2 = LazySingleton.getInstance2();
        System.out.println(Thread.currentThread().getName() +":"+ instance2);
    }
}
