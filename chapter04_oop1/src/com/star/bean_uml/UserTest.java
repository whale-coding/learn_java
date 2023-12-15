package com.star.bean_uml;

/**
 * @Date 2023-12-14 20:23 星期四
 * @Author: 聂建强
 * @Description:
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.age);

        User u2 = new User(2);
        System.out.println(u2.age);
        u2.age = 3;
        u2.age = 4;
    }
}


class User{
    // 属性(或实例变量)
    String name;
    int age = 10;

    public User(){

    }
    public User(int a){
        age = a;
    }
}
