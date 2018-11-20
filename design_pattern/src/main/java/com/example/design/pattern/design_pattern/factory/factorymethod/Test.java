package com.example.design.pattern.design_pattern.factory.factorymethod;

import java.util.Calendar;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/19 23:45
 */
public class Test {
    public static void main(String[] args) {
        AbstractVideoFactory javaVideoFactory = new JavaVideoFactory();
        Video video = javaVideoFactory.getVideo();
        video.produce();

        AbstractVideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video video2 = pythonVideoFactory.getVideo();
        video2.produce();


    }


}
