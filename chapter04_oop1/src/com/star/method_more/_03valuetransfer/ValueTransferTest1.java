package com.star.method_more._03valuetransfer;

/**
 * @Date 2023-12-10 23:20 星期日
 * @Author: 聂建强
 * @Description:
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test = new ValueTransferTest1();

        // 1. 对于基本数据类型的变量来说
        int m =10;

        test.method1(m);

        System.out.println("m = " + m);  // m = 10

        int m2 = test.method2(m);

        System.out.println("m = " + m);  // m = 10
        System.out.println("m = " + m2);  // m = 10

        // 2.对于引用数据类型
        Person p = new Person();
        p.age = 10;

        test.method3(p);

        System.out.println(p.age);  // 11

    }

    public void method1(int m){
        m++;
    }
    public int method2(int m){
        return m++;
    }
    public void method3(Person p){
        p.age++;
    }
}

class Person{
    int age;
}
