package com.example.design.pattern.design_pattern.factory.decorator.v2;

/**
 * @Author: Kingcym
 * @Description:   装饰者模式
 * @Date: 2018/11/25 21:32
 */
public class AbstractDecorator extends ABattercake{
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
