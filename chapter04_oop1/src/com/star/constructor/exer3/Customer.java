package com.star.constructor.exer3;


/**
 * @Date 2023-12-14 20:05 星期四
 * @Author: 聂建强
 * @Description:
 */
public class Customer {
    // 属性
    private String firstName;
    private String lastName;
    private Account account;

    // 构造器
    public Customer(){

    }
    public Customer(String f , String l){
        firstName = f ;
        lastName = l ;
    }
    //  get和set方法
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account a){
        account = a ;
    }

}
