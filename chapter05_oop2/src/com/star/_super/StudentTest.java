package com.star._super;

/**
 * @Date 2023-12-16 20:06 星期六
 * @Author: 聂建强
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.sleep();

        s1.show();

        System.out.println();
        s1.show2();

        System.out.println(s1.name);

        //************************
        System.out.println();

        Student s2 = new Student();

        System.out.println("***************");

        Student s3 = new Student("Tom",12);
    }
}
