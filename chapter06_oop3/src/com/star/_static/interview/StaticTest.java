package com.star._static.interview;

/**
 * @Date 2023-12-18 22:57 星期一
 * @Author: 聂建强
 * @Description:  关于static的面试题
 */
public class StaticTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();  // hello!
        System.out.println(order.count);  // 1
    }
}


class Order {
    public static int count = 1;

    public static void hello() {
        System.out.println("hello!");
    }
}
