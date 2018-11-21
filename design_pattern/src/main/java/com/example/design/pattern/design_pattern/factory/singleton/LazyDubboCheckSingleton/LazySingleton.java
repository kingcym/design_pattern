package com.example.design.pattern.design_pattern.factory.singleton.LazyDubboCheckSingleton;

/**
 * @Author: Kingcym
 * @Description: 懒汉式
 * @Date: 2018/11/21 21:21
 */
public class LazySingleton {
    private volatile static LazySingleton lazySingleton = null;

    private LazySingleton() {}


    /**
     * 双重check模式，有效频繁获取锁释放锁问题
     * @return
     */
    public  static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized(LazySingleton.class){
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                    /**
                     * new 的时候，经历下面三个步骤
                     * 1.分配内存给对象
                     * 2.初始化对象
                     * 3.设置LazySingleton指向刚分配的内存地址
                     *
                     * <p>
                     *     因为重排序问题，上面三个步骤顺序，可能是1 3 2
                     *     当线程1到步骤3时，这时对象还没有初始化
                     *     这是线程2 执行到“(lazySingleton == null)”，因为LazySingleton指向刚分配的内存地址，
                     *     是不为null的，但是实际对象没有初始化完毕，线程2访问该对象时，系统将异常。
                     *
                     *     为了避免这中情况，可加volatile关键字，防止重排序
                     * </p>
                     */

                }
            }
        }
        return lazySingleton;
    }
}
