package com.star.example.exer3;

/**
 * @Date 2023-12-10 12:53 星期日
 * @Author: 聂建强
 * @Description:
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.3;
        c1.findArea();

        System.out.println("面积为："+c1.findArea2());
    }
}
