package com.star.constructor.exer3;

/**
 * @Date 2023-12-14 19:52 星期四
 * @Author: 聂建强
 * @Description:
 */
public class Account {
    // 属性
    private int id;  // 账号
    private double balance;  // 余额
    private double annuallnterestRate;  // 年利率

    // 构造器
    public Account(){

    }
    public Account(int i , double b , double a){
        id = i;
        balance = b;
        annuallnterestRate = a;

    }

    // get和set方法
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance = b;
    }
    public double getAnnuallnterestRate(){
        return annuallnterestRate;
    }
    public void setAnnuallnterestRate(double a){
        annuallnterestRate = a;
    }

    // 取钱方法
    public void withdraw(double amount){
        if (amount<= balance && amount>0){
            balance -= amount;
            System.out.println("成功取出：" + amount);
        }else {
            System.out.println("余额不足，取款失败");
        }
    }

    // 存钱方法
    public void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("成功存入：" + amount);
        }

    }

}
