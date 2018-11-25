package com.example.design.pattern.design_pattern.factory.adapter;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/25 23:15
 */

/**
 * 类适配
 * 使Adaptee有Target的方法
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //。。。
        super.adapteeRequest();
        //。。。
    }
}
