package com.star.polymorphism.exer3;

/**
 * @Date 2023-12-16 23:31 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
