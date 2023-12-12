package com.star.method_more._03valuetransfer;

/**
 * @Date 2023-12-10 23:20 星期日
 * @Author: 聂建强
 * @Description:
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 test = new ValueTransferTest2();

        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);  // m = 10, n = 20

        //交换两个变量的值
        // 方式1：直接交换（真交换了）
        // int temp = m;
        // m = n;
        // n = temp;

        // 方式2：调用方法交换
        test.swap(m,n);

        System.out.println("m = " + m + ", n = " + n);  // test.swap(m,n),是值传递，交换的是swap方法中的m和n跟main方法的m和n没有关系
    }

    public void swap(int m ,int n){
        int temp = m;
        m = n;
        n = temp;
    }
}
