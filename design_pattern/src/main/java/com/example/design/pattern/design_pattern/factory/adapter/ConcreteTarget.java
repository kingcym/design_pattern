package com.example.design.pattern.design_pattern.factory.adapter;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/25 23:11
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget方法");
    }
}
