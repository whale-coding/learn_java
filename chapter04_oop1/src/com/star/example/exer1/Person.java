package com.star.example.exer1;

/**
 * @Date 2023-12-10 12:15 星期日
 * @Author: 聂建强
 * @Description:
 */
public class Person {
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println("studying");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        age += addAge;
    }
}
