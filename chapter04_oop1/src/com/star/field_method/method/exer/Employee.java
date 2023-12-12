package com.star.field_method.method.exer;

/**
 * @Date 2023-12-09 16:06 星期六
 * @Author: 聂建强
 * @Description:  声明员工类Employee，包含属性：编号id、姓名name、年龄age、薪资salary。
 */
public class Employee {
    //属性（或成员变量）
    int id;  //编号
    String name; //姓名
    int age; //年龄
    double salary; //薪资

    //定义一个方法，用于显示员工的属性信息
    public void show(){
        System.out.println("id = " + id + ",name = " + name +
                ", age = " + age + ", salary = " + salary);
    }

    public String show1(){
        return "id = " + id + ",name = " + name +
                ", age = " + age + ", salary = " + salary;
    }
}
