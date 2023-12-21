package com.star._static.exer1;

/**
 * @Date 2023-12-18 22:51 星期一
 * @Author: 聂建强
 * @Description:
 */
public class Account {
    private int id;  // 账号

    private String password;  // 密码

    private double balance;  // 余额

    private static double interestRate;  // 利率

    private static double minBalance = 1.0;  // 最小余额

    private static int init = 1001;  // 用于自动生成id的基数

    public Account() {
        this.id = init;
        init++;
        password = "000000";
    }

    public Account(String password, double balance) {
        this.password = password;
        this.balance = balance;
        this.id = init;
        init++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
