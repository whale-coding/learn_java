package com.star.singleton;


/**
 * @Date 2023-12-18 23:00 星期一
 * @Author: 聂建强
 * @Description:
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}


// 饿汉式单例模式
class Bank{

    // 1.类的构造器私有化
    private Bank(){

    }

    // 2.在类的内部创建当前类的实例
    // 4.此属性也必须声明为static的
    private static Bank instance = new Bank();

    // 3.使用getXxx()方法获取当前类的实例，必须声明为static的
    public static Bank getInstance(){
        return instance;
    }

}
