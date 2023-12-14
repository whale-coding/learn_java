package com.star.encapsulation.exer1;

/**
 * @Date 2023-12-13 22:55 星期三
 * @Author: 聂建强
 * @Description:
 */
public class Person {
    private int age;

    // 获取age属性
    public int getAge() {
        return age;
    }

    // 设置age属性
    public void setAge(int a) {
        if (age>= 0 && age<= 130){
            age = a ;
        }else {
            System.out.println("你输入的数据非法");
        }
    }
}
