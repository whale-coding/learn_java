package com.star.polymorphism.exer1;

/**
 * @Date 2023-12-16 23:14 星期六
 * @Author: 聂建强
 * @Description:
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {

    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 求面积
    public double findArea(){
        return 0.0;
    }
}
