/**
 * Copyright (C),2018, 萤石
 * FileName: JavaVideoFactory
 * Author:   caiyaming
 * Date:     2018-11-20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.design.pattern.design_pattern.factory.factorymethod;

/**
 * @description：<br>
 *
 * @author: caiyaming
 * @date: 2018-11-20 18:14
 * @since: V1.0.0
 */
public class PythonVideoFactory extends AbstractVideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
