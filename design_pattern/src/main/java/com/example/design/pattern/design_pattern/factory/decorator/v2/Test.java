package com.example.design.pattern.design_pattern.factory.decorator.v2;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/25 21:37
 */
public class Test {

    public static void main(String[] args) {
        ABattercake battercake ;
        //普通煎饼
        battercake = new Battercake();
        System.out.println(battercake.getDesc() +"---"+ battercake.cost());
        //加鸡蛋煎饼
        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getDesc() +"---"+ battercake.cost());
        //加香肠煎饼
        battercake = new SausgeDecorator(battercake);
        System.out.println(battercake.getDesc() +"---"+ battercake.cost());

        //加鸡蛋煎饼
        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getDesc() +"---"+ battercake.cost());
    }
}
