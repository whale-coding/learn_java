package com.star.override.test2;

import com.star.override.test1.Order;

/**
 * @Date 2023-12-15 21:05 星期五
 * @Author: 聂建强
 * @Description:
 */
public class OrderTest {
    public void method(){

        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();


        // 不能访问
       // order.orderPrivate = 1;
       // order.orderDefault = 1;
       // order.orderProtected = 1;
       //
       // order.methodPrivate();
       // order.methodDefault();
       // order.methodProtected();


    }
}
