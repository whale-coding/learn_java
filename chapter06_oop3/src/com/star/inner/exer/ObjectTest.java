package com.star.inner.exer;

/**
 * @Date 2023-12-25 16:58 星期一
 * @Author: 聂建强
 * @Description:
 */
public class ObjectTest {
    public static void main(String[] args) {
        // 提供有一个继承于Object的匿名子类的匿名对象
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();
    }
}


class SubObject extends Object{
    public void test(){
        System.out.println("尚硅谷");
    }
}
