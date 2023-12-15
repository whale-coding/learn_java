package com.star.constructor.exer3;

/**
 * @Date 2023-12-14 20:10 星期四
 * @Author: 聂建强
 * @Description:
 */
public class CustomerTest {
    public static void main(String[] args) {
        // 创建Customer实例
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);
        // 或
        // customer.setAccount(new Account(1000,2000,0.0123));

        // 针对于客户的账户进行取钱、存钱的操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        // 输出客户信息
        System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() +
                "] has a account:id is " + customer.getAccount().getId() + ",annualInterestRate is " +
                customer.getAccount().getAnnuallnterestRate()*100 + "%,balance is " +
                customer.getAccount().getBalance());

        /*
        * 关于匿名对象
        * 1. 匿名对象往往只能被调用一次
        * 2. 匿名对象常常作为实参传递给方法的形参。
        *
         */
        new Account(1001,2000,0.0123).withdraw(1000);
        System.out.println(new Account(1001, 2000, 0.0123).getBalance());
    }

}
