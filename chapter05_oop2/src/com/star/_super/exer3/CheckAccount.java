package com.star._super.exer3;

/**
 * @Date 2023-12-16 20:34 星期六
 * @Author: 聂建强
 * @Description:
 */
public class CheckAccount extends Account{

    private double overdraft;  // 可透支限额

    public CheckAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 针对于可透支的账户的取钱的操作
     * @param amount  要取的钱数
     */
    @Override
    public void withdraw(double amount){
        if(getBalance() >= amount){
            // 错误的：
           // getBalance() = getBalance() - amount;
            // 正确的
            super.withdraw(amount);
        }else if(getBalance() + overdraft >= amount){
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        }else{
            System.out.println("超过可透支限额");
        }
    }
}
