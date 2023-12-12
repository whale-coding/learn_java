package com.star.method_more._03valuetransfer.exer1;

/**
 * @Date 2023-12-11 15:49 星期一
 * @Author: 聂建强
 * @Description:  定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 */
public class Circle {

    double radius;//半径

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
