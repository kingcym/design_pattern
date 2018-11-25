package com.example.design.pattern.design_pattern.factory.decorator.v2;

import com.example.design.pattern.design_pattern.factory.decorator.v1.BattercakeWithEgg;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/24 22:20
 */
public class SausgeDecorator extends AbstractDecorator {

    public SausgeDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 3;
    }
}
