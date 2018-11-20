package com.example.design.pattern.design_pattern.factory.factorymethod;

/**
 * @Author: Kingcym
 * @Description:      工厂方法
 *                  把创建的职能移交给子类
 * @Date: 2018/11/19 23:38
 */
//抽象工厂
public abstract class AbstractVideoFactory {
    public abstract Video getVideo();
}
