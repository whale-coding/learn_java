package com.star._super;

/**
 * @Date 2023-12-15 20:05 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Person {
    //属性
    String name;
    private int age;

    int id = 1001;  // 身份证号

    public Person() {
        System.out.println("Person()....");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(){
        System.out.println("人睡觉");
    }

    public void doSport(){
        System.out.println("人运动");
    }

}
