package com.star._interface.exer2;

/**
 * @Date 2023-12-22 22:50 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Circle {
    private double radius;  // 半径

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
