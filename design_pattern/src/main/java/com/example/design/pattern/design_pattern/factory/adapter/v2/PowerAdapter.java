package com.example.design.pattern.design_pattern.factory.adapter.v2;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/25 23:40
 */
public class PowerAdapter implements DC5V {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220();

        //变压器
        int adapterOuput = adapterInput/44;
        return adapterOuput;
    }
}
