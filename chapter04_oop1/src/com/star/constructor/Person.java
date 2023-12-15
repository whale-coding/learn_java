package com.star.constructor;

/**
 * @Date 2023-12-14 19:30 星期四
 * @Author: 聂建强
 * @Description:
 */
public class Person {
    // 属性
    String name;
    int age;

    // 构造器(构造方法)
    public Person(){
        System.out.println("Person()......");
    }
    public Person(int a){
        age = a;
    }
    public Person(String n){
        name = n;
    }

    public Person(int a ,String n){
        age = a ;
        name = n;
    }

    // 方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(int hour){
        System.out.println("每天睡觉：" + hour + "小时");
    }
}
