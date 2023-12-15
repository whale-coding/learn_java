package com.star._this.exer2;

/**
 * @Date 2023-12-14 22:50 星期四
 * @Author: 聂建强
 * @Description: 客户类
 */
public class Customer {
    private String firstName;//名
    private String lastName;//姓

    private Account account; //账户

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
