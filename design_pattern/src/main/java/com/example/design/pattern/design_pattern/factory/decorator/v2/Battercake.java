package com.example.design.pattern.design_pattern.factory.decorator.v2;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/24 22:16
 */
public class Battercake extends ABattercake{
    protected String getDesc(){
        return "煎饼";
    }

    protected int cost(){
        return 5;
    }


}
