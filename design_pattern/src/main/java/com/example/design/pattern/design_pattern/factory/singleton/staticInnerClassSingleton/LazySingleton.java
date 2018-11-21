package com.example.design.pattern.design_pattern.factory.singleton.staticInnerClassSingleton;

/**
 * @Author: Kingcym
 * @Description:  内部静态类延迟初始化
 * @Date: 2018/11/21 21:21
 */
public class LazySingleton {
    private LazySingleton() {}

    private static class InnerClass {
        private  static LazySingleton lazySingleton = new LazySingleton();
    }

    public  static LazySingleton getInstance() {
        return InnerClass.lazySingleton;
    }

    /**
     * JVM在类的初始化阶段（类加载后，被线程使用之前），
     * 在这个阶段执行类的初始化，初始化期间JVM会获取一个锁，
     * 这个锁同步多个线程对一个类的初始化。
     *
     */


}
