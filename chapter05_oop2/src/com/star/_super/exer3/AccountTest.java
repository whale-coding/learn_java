package com.star._super.exer3;

/**
 * @Date 2023-12-16 20:38 星期六
 * @Author: 聂建强
 * @Description:
 */
public class AccountTest {
    public static void main(String[] args) {

        Account acct = new Account(1122,20000,0.045);

        acct.withdraw(30000);
        System.out.println("您的账户余额为：" + acct.getBalance());

        acct.withdraw(2500);
        acct.deposit(3000);
        System.out.println("您的账户余额为：" + acct.getBalance());

        System.out.println("月利率为：" + acct.getMonthlyInterest());
    }
}
