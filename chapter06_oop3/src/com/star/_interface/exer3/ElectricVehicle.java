package com.star._interface.exer3;

/**
 * @Date 2023-12-22 23:03 星期五
 * @Author: 聂建强
 * @Description:
 */
public class ElectricVehicle extends Vehicle implements IPower{

    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }
    @Override
    public void power() {
        System.out.println("电动车通过电机驱动行驶");
    }

    @Override
    public void run() {
        System.out.println("电动车使用电力提供动力");
    }
}
