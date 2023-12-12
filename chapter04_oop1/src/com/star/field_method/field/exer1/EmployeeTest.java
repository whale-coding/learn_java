package com.star.field_method.field.exer1;

/**
 * @Date 2023-12-09 15:50 星期六
 * @Author: 聂建强
 * @Description:  声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建类的实例（或创建类的对象、类的实例化）
        Employee employee1 = new Employee();

        System.out.println(employee1);  // Employee@3b07d329  即 类型@地址值

        employee1.id = 1001;
        employee1.name = "Tom";
        employee1.age = 24;
        employee1.salary = 7800;
        System.out.println("id = " + employee1.id + ",name = " + employee1.name +
                ", age = " + employee1.age + ", salary = " + employee1.salary);

        Employee employee2 = new Employee();

        System.out.println("id = " + employee2.id + ",name = " + employee2.name +
                ", age = " + employee2.age + ", salary = " + employee2.salary);

    }
}
