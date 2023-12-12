package com.star.field_method.field.exer2;


/**
 * @Date 2023-12-09 15:59 星期六
 * @Author: 聂建强
 * @Description:
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //创建Employee的一个实例
        Employee employee = new Employee();
        employee.id = 1001;
        employee.name = "杰克";  // employee.name = new String("杰克");
        employee.age = 24;
        employee.salary = 8900;

        employee.birthday = new MyDate();
        employee.birthday.year = 1998;
        employee.birthday.month = 2;
        employee.birthday.day = 28;

        /*
         另一种写法：
         MyDate mydate1 = new MyDate();
         employee.birthday = mydate1;
         mydate1.year = 1998;
         mydate1.month = 2;
         mydate1.day = 28;

         */


        //打印员工信息
        System.out.println("id = " + employee.id + ",name = " + employee.name +
                ", age = " + employee.age + ", salary = " + employee.salary +
                ", birthday = [" + employee.birthday.year + "年" + employee.birthday.month +
                "月" + employee.birthday.day + "日]");


    }
}
