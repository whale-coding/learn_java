package com.star.field_method.field;

/**
 * @Date 2023-12-09 15:23 星期六
 * @Author: 聂建强
 * @Description:
 */
public class FieldTest {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name+","+ person.age);

        person.sleep(8);
        person.eat();
    }
}


class Person{
    // 属性（或成员变量）
    String name;
    int age;
    char gender;

    // 方法
    public void eat(){
        String food = "宫保鸡丁";  // 局部变量
        System.out.println("我爱吃："+food);
    }
    public void sleep( int hour){  // 形参：属于局部变量
        System.out.println("人不能少于" + hour + "小时的睡眠");

        // System.out.println("我喜欢吃" + food);  // 编译不通过，因为超出了food变量的作用域

        System.out.println("name = " + name);
    }

}
