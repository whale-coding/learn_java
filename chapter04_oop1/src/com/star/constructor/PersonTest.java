package com.star.constructor;

/**
 * @Date 2023-12-14 19:34 星期四
 * @Author: 聂建强
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.eat();

        Person p2 = new Person(1);
        System.out.println(p2.age);  // 1
    }
}
