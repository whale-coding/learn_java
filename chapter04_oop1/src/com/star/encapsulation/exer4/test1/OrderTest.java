package com.star.encapsulation.exer4.test1;

/**
 * @Date 2023-12-13 23:07 星期三
 * @Author: 聂建强
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderDefault = 1;
        order.orderPublic = 2;
        //调用方法
        order.methodDefault();
        order.methodPublic();

        //不能调用
        // order.orderPrivate = 3;
        // order.methodPrivate();
    }
}
