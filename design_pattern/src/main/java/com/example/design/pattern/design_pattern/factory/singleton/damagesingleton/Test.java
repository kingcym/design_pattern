package com.example.design.pattern.design_pattern.factory.singleton.damagesingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/21 23:34
 */
public class Test {
    //序列化破坏单例
    public static void main1(String[] args) throws IOException, ClassNotFoundException {
        LazySingleton singleton = LazySingleton.getInstance();
        ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream("file"));
        oop.writeObject(singleton);

        File file = new File("file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        LazySingleton newsingleton = (LazySingleton)ois.readObject();

        System.out.println(singleton);
        System.out.println(newsingleton);
        /**
         * 序列化破坏单例模式
         * 因为从流中取对象时，重新new了一个。
         * 要在对象中添加一个 readResolve()
         * 会从该方法中去读取对象
         */
    }
    //反射破坏单例
    public static void main(String[] args) throws Exception {
        LazySingleton singleton = LazySingleton.getInstance();

        Class<LazySingleton> aClass = LazySingleton.class;
        //拿到构造器
        Constructor<LazySingleton> constructor = aClass.getDeclaredConstructor();
        //修改构造器权限
        constructor.setAccessible(true);
        //拿到对象
        LazySingleton newsingleton = constructor.newInstance();
        System.out.println(singleton);
        System.out.println(newsingleton);
    }
}
