package com.example.design.pattern.design_pattern.factory.abstractfactory;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();

        //mybatits的  sqlsessionfactory
    }
}
