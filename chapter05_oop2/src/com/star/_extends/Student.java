package com.star._extends;

/**
 * @Date 2023-12-15 20:05 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Student extends Person{
    String school;

    public void study(){
        System.out.println("学生学习");
    }

    public void show1(){
        System.out.println("age : " + getAge());
    }
}
