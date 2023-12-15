package com.star.constructor.exer1;

/**
 * @Date 2023-12-14 19:36 星期四
 * @Author: 聂建强
 * @Description:
 */
public class Student {
    // 属性
    String name;
    int age;
    String school;
    String major;

    // 构造器
    Student(String n, int a){
        name = n ;
        age = a ;
    }
    Student(String n, int a, String s){
        name = n ;
        age = a ;
        school = s ;
    }
    Student(String n, int a, String s, String m){
        name = n ;
        age = a ;
        school = s ;
        major = m ;
    }

    // 方法
    public String getInfo(){
        return "name = " + name + ",age = " + age +
                ",school = " + school + ", major = " + major;
    }
}
