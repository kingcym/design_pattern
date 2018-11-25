package com.example.design.pattern.design_pattern.factory.singleton.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * @Author: Kingcym
 * @Description:  克隆模式  破坏单例模式
 * @Date: 2018/11/23 0:58
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
//        User user = new User();
//        user.setA("aa");
//        ArrayList<Date> list = new ArrayList<>();
//        list.add(new Date());
//        user.setList(list);
//        User cloneuser = (User) user.clone();
//
//        Date date = cloneuser.getList().get(0);
//        date.setTime(0l);
//
//        System.out.println(user);
//        System.out.println(cloneuser);

        ArrayList<Date> list = new ArrayList<>();
        list.add(new Date());
        System.out.println(list.get(0).getTime());

        ArrayList<Date> list1 = new ArrayList<>(10);
        Collections.copy(list, list1);

        list1.get(0).setTime(0L);

        System.out.println(list.get(0).getTime());
        System.out.println(list1.get(0).getTime());

    }
}
