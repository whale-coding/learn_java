package com.star.constructor.exer2;

/**
 * @Date 2023-12-14 19:41 星期四
 * @Author: 聂建强
 * @Description:
 */
public class TriAngle {
    // 属性
    private double base;
    private double height;

    // 构造器
    public TriAngle() {

    }
    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }


    // get()、set()方法
    public double getBase(){
        return base;
    }
    public void setBase(double b){
        base = b;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height = h;
    }

    // 其他方法(求面积的方法)
    public double findArea(){
        return (base * height)/2;
    }

}
