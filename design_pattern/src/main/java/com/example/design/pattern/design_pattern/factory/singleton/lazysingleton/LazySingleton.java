package com.example.design.pattern.design_pattern.factory.singleton.lazysingleton;

/**
 * @Author: Kingcym
 * @Description: 懒汉式
 * @Date: 2018/11/21 21:21
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    /**
     * 非线程安全
     * @return
     */
    public static LazySingleton getInstance1() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     *
     * synchronized用在static方法，锁住整个类,
     * 虽然保证了线程安全，但是获取锁和释放锁消耗资源
     * @return
     */
    public synchronized static LazySingleton getInstance2() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
