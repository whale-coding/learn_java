package com.star.override;

/**
 * @Date 2023-12-15 20:05 星期五
 * @Author: 聂建强
 * @Description:
 */
public class Student extends Person {
    String school;

    public void study(){
        System.out.println("学生学习");
    }

    public void show1(){
        System.out.println("age : " + getAge());
    }

    @Override
    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }

    @Override
    public void sleep() {
        System.out.println("学生应该多睡觉");
    }

    @Override
    public int info() {
        return 10;
    }

    @Override
    public Person info1() {
        return null;
    }
}
