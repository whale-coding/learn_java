package com.star._this.exer2;

/**
 * @Date 2023-12-14 22:48 星期四
 * @Author: 聂建强
 * @Description: 账户类
 */
public class Account {
    private double balance;//余额

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    //存钱
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("成功存入：" + amt);
        }
    }

    //取钱
    public void withdraw(double amt){
        if(balance >= amt && amt > 0){
            balance -= amt;
            System.out.println("成功取出：" + amt);
        }else{
            System.out.println("取款数额有误或余额不足");
        }
    }
}
