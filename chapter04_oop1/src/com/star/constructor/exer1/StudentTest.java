package com.star.constructor.exer1;

/**
 * @Date 2023-12-14 19:38 星期四
 * @Author: 聂建强
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {

        Student stu1 = new Student("刘强东",48,"中国人民大学","社会学");
        System.out.println(stu1.getInfo());

        Student stu2 = new Student("奶茶妹妹",28,"清华大学");
        System.out.println(stu2.getInfo());

    }
}
