package com.star.example.exer1;


/**
 * @Date 2023-12-10 12:18 星期日
 * @Author: 聂建强
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "小明";
        p1.age = 24;
        p1.gender = '男';
        p1.study();

        System.out.println(p1.showAge());  // 24

        p1.addAge(2);
        System.out.println(p1.showAge());  // 26


        Person p2 = new Person();


        System.out.println(p2.age);  // 0

        p2.addAge(4);
        System.out.println(p2.showAge());  // 4

    }
}
