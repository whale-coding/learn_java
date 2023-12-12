package com.star.oop;

/**
 * @Date 2023-12-09 14:53 星期六
 * @Author: 聂建强
 * @Description:  手机类
 */
public class Phone {
    // 属性
    String name;  // 品牌
    double price;  // 价格

    // 方法
    public void call(){
        System.out.println("手机能够打电话");
    }
    public void sendMessage(String message){
        System.out.println("发送信息："+message);
    }
    public void playGame(){
        System.out.println("手机可以打游戏");
    }
}
