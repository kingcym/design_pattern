package com.example.design.pattern.design_pattern.factory.factorymethod;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/19 23:34
 */
@Slf4j
public class JavaVideo extends Video {
    @Override
    public void produce() {
        log.info("生产Java课程");
    }
}
