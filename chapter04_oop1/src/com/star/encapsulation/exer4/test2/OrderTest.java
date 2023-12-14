package com.star.encapsulation.exer4.test2;


import com.star.encapsulation.exer4.test1.Order;

/**
 * @Date 2023-12-13 23:08 星期三
 * @Author: 聂建强
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderPublic = 1;

        //调用方法
        order.methodPublic();


        //不能调用
       // order.orderPrivate = 1;
       // order.orderDefault = 2;
       //
       // order.methodPrivate();
       // order.methodDefault();
    }
}
