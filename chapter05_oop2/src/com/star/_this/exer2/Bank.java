package com.star._this.exer2;

/**
 * @Date 2023-12-14 22:49 星期四
 * @Author: 聂建强
 * @Description: 银行类
 */
public class Bank {
    private Customer[] customers;//用于保存多个客户
    private int numberOfCustomer;//用于记录存储的客户的个数

    public Bank() {
        customers = new Customer[10];
    }

    /**
     * 获取客户列表中存储的客户的个数
     * @return 个数
     */
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    /**
     * 将指定姓名的客户保存在银行的客户列表中
     * @param firstName 姓
     * @param lastName 名
     */
    public void addCustomer(String firstName,String lastName){
        Customer customer = new Customer(firstName,lastName);
        customers[numberOfCustomer++] = customer;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index 索引
     * @return 客户信息
     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= numberOfCustomer){
            return null;
        }
        return customers[index];
    }


}
