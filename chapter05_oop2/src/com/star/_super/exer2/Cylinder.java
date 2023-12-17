package com.star._super.exer2;

/**
 * @Date 2023-12-15 20:45 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Cylinder extends Circle {
    private double length;  // 高
    public Cylinder(){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // 求圆柱的体积
    public double findVolume(){

        return super.findArea() * getLength();
    }

    // 求表面积
    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius()*2 +
                2 * Math.PI * getRadius() * getLength();
    }
}
