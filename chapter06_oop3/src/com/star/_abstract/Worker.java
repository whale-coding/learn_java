package com.star._abstract;

/**
 * @Date 2023-12-21 23:16 星期四
 * @Author: 聂建强
 * @Description:
 */
public abstract class Worker extends Person {

    @Override
    public void eat() {
        System.out.println("工人很辛苦，多吃");
    }
}
