package com.star._this.exer2;

/**
 * @Date 2023-12-14 22:52 星期四
 * @Author: 聂建强
 * @Description:
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("操","曹");
        bank.addCustomer("备","刘");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);

        System.out.println("账户余额为：" + bank.getCustomer(0).getAccount().getBalance());
    }
}
