package com.example.design.pattern.design_pattern.factory.factorymethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/19 23:45
 */
public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);


    public static void main(String[] args) {
        AbstractVideoFactory javaVideoFactory = new JavaVideoFactory();
        Video video = javaVideoFactory.getVideo();
        video.produce();

        AbstractVideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video video2 = pythonVideoFactory.getVideo();
        video2.produce();

        //ILoggerFactory
    }


}
