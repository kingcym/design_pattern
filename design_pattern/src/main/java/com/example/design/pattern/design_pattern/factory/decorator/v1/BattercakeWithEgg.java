package com.example.design.pattern.design_pattern.factory.decorator.v1;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/24 22:20
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getDesc() {
        return super.getDesc() + "-加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
