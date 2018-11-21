package com.example.design.pattern.design_pattern.factory.singleton.LazyDubboCheckSingleton;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/21 22:03
 */
public class SingletonThread implements Runnable {
    @Override
    public void run() {
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() +":"+ instance2);
    }
}
