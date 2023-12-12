package com.star.example.exer3;

/**
 * @Date 2023-12-10 12:50 星期日
 * @Author: 聂建强
 * @Description:  设计类Circle计算圆的面积。
 */
public class Circle {
    // 属性
    double radius;  // 半径

    // 方法
    public void findArea(){
        System.out.println("面积为："+ Math.PI*radius*radius);
    }
    // 或者用这种return返回的方式
    public double findArea2(){
        return Math.PI*radius*radius;
    }
}
