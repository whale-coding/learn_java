package com.star._interface.exer3;

/**
 * @Date 2023-12-22 23:01 星期五
 * @Author: 聂建强
 * @Description:
 */
public abstract class Vehicle {
    private String brand;  // 品牌
    private String color;  // 颜色

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void run();
}
