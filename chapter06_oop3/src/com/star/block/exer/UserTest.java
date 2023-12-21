package com.star.block.exer;

/**
 * @Date 2023-12-20 22:02 星期三
 * @Author: 聂建强
 * @Description:
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 =  new User("Tom","654321");
        System.out.println(u2.getInfo());

        System.out.println();
        User1 u3 = new User1();
        System.out.println(u3.getInfo());
    }
}
