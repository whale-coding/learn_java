package com.star._abstract;

/**
 * @Date 2023-12-21 23:14 星期四
 * @Author: 聂建强
 * @Description:
 */
public class Student extends Person{
    String school;

    public Student() {

    }

    public Student(String school) {
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void breath() {
        System.out.println("学生应该多呼吸新鲜空气");
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

    @Override
    public void sleep() {
        System.out.println("学生要保证充足的睡眠");
    }
}
