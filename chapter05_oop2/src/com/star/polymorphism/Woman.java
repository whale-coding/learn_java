package com.star.polymorphism;

/**
 * @Date 2023-12-16 22:37 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Woman extends Person{
    boolean isBeauty;

    @Override
    public void eat(){
        System.out.println("女人应该少吃，减肥");
    }
    @Override
    public void walk(){
        System.out.println("女人窈窕的走路");
    }

    public void goShopping(){
        System.out.println("女人喜欢逛街...");
    }
}
