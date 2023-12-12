package com.star.example.exer2;

/**
 * @Date 2023-12-10 12:46 星期日
 * @Author: 聂建强
 * @Description:
 */
public class Exer02Test {
    public static void main(String[] args) {
        Exer02 exer = new Exer02();

        exer.method1();
        System.out.println("*************************");

        int area = exer.method2();
        System.out.println(area);
        System.out.println("*************************");

        int area2 = exer.method3(3, 8);
        System.out.println(area2);
    }
}
