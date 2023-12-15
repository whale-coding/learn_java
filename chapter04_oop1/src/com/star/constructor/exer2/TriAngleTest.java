package com.star.constructor.exer2;

/**
 * @Date 2023-12-14 19:41 星期四
 * @Author: 聂建强
 * @Description:
 */
public class TriAngleTest {
    public static void main(String[] args) {

        // 创建TriAngle的实例1
        TriAngle triAngle1 = new TriAngle();
        triAngle1.setBase(5);
        triAngle1.setHeight(6);
        System.out.println(triAngle1.findArea());

        //创建TriAngle的实例2
        TriAngle triAngle2 = new TriAngle(8,9);
        System.out.println(triAngle2.findArea());
    }
}
