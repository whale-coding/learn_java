package com.star.field_method.method.exer;

/**
 * @Date 2023-12-09 16:08 星期六
 * @Author: 聂建强
 * @Description:  声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建类的实例（或创建类的对象、类的实例化）
        Employee emp1 = new Employee();

        System.out.println(emp1);  // 类型@地址值

        emp1.id = 1001;
        emp1.name = "Tom";
        emp1.age = 24;
        emp1.salary = 7800;

        emp1.show();

        // System.out.println(emp1.show());  // 编译报错

        System.out.println(emp1.show1());  // 编译通过

        Employee emp2 = new Employee();
        emp2.show();
    }
}
