package com.star._abstract;

/**
 * @Date 2023-12-21 23:12 星期四
 * @Author: 聂建强
 * @Description:
 */
public abstract class Person extends Creature{  // 抽象类
    String name;
    int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();  // 抽象方法

    public abstract void sleep();  // 抽象方法
}
