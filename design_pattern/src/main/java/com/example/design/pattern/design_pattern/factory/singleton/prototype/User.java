package com.example.design.pattern.design_pattern.factory.singleton.prototype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/23 0:52
 */
public class User implements Cloneable{
    private String a;
    private List<Date> list;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public List<Date> getList() {
        return list;
    }

    public void setList(List<Date> list) {
        this.list = list;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User clone =(User) super.clone();
        clone.list = new ArrayList<>(list);
        return clone;
    }
}
