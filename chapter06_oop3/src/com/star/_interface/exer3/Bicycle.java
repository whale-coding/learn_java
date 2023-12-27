package com.star._interface.exer3;

/**
 * @Date 2023-12-22 23:06 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }
    @Override
    public void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
