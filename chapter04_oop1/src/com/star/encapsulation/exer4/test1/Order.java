package com.star.encapsulation.exer4.test1;

/**
 * @Date 2023-12-13 23:06 星期三
 * @Author: 聂建强
 * @Description:
 */
public class Order {
    //声明不同权限的属性
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    //声明不同权限的方法
    private void methodPrivate(){

    }
    void methodDefault(){

    }
    public void methodPublic(){

    }

    public void test(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;

        methodPrivate();
        methodDefault();
        methodPublic();
    }
}
