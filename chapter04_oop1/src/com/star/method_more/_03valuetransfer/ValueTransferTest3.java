package com.star.method_more._03valuetransfer;

/**
 * @Date 2023-12-10 23:20 星期日
 * @Author: 聂建强
 * @Description:
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {

        ValueTransferTest3 test = new ValueTransferTest3();

        Data data = new Data();
        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);  // m = 10, n = 20

        //交换两个变量的值
        // 方式1：直接交换（真交换了）
        // int temp = m;
        // m = n;
        // n = temp;

        // 方式2：调用方法交换
        test.swap(data);

        System.out.println("m = " + data.m + ", n = " + data.n);  // m = 20, n = 10
    }

    public void swap(Data data){
        int temp = data.m ;
        data.m = data.n;
        data.n = temp;
    }
}


class Data{
    int m;
    int n;
}
