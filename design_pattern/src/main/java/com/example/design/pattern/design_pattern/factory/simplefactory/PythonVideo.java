package com.example.design.pattern.design_pattern.factory.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/19 23:34
 */
@Slf4j
public class PythonVideo extends Video {
    @Override
    public void produce() {
        log.info("生产python课程");
    }
}
