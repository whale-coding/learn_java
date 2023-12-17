package com.star.object.equals.apply;

/**
 * @Date 2023-12-17 12:48 星期日
 * @Author: 聂建强
 * @Description:
 */
public class Account {
    private double balance;//余额

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return Double.compare(balance, account.balance) == 0;
    }

}
