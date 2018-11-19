package com.example.design.pattern.design_pattern.factory.simplefactory;

/**
 * @Author: Kingcym
 * @Description:      简单工厂
 * @Date: 2018/11/19 23:38
 */
public class VideoFactory {
    public static Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
