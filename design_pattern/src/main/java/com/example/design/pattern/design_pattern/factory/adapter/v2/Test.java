package com.example.design.pattern.design_pattern.factory.adapter.v2;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/25 23:43
 */
public class Test {
    public static void main(String[] args) {
        DC5V powerAdapter = new PowerAdapter();
        powerAdapter.outputDC5V();

    }
}
