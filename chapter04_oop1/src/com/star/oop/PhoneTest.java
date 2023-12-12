package com.star.oop;

/**
 * @Date 2023-12-09 14:56 星期六
 * @Author: 聂建强
 * @Description:  Phone类的测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 创建Phone的对象
        Phone phone = new Phone();

        // 通过Phone的对象，调用其内部声明的属性或方法
        // 格式："对象.属性" 或 "对象.方法"
        phone.name = "huawei mate60";
        phone.price = 6000;

        System.out.println("name= "+ phone.name+",price = "+phone.price);

        // 调用类的方法
        phone.call();
        phone.sendMessage("你好 JAVA！");
        phone.playGame();

    }
}
