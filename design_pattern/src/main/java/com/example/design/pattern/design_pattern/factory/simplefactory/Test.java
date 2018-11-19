package com.example.design.pattern.design_pattern.factory.simplefactory;

import java.util.Calendar;
import java.util.Locale;

/**
 * @Author: Kingcym
 * @Description:
 * @Date: 2018/11/19 23:45
 */
public class Test {
    public static void main(String[] args) {

        Video video = VideoFactory.getVideo(JavaVideo.class);
        video.produce();
        Video video2 = VideoFactory.getVideo(PythonVideo.class);
        video2.produce();

        /**
         * jdk源码实现：
         *
         {@link Calendar.getInstance()}
         */
        Calendar.getInstance();

    }


}
