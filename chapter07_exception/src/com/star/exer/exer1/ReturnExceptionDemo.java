package com.star.exer.exer1;

/**
 * @Date 2024/1/21 15:58
 * @Author: 聂建强
 * @Description:  笔试题:给出下面程序的输出
 */
public class ReturnExceptionDemo {
    static void methodA() throws Exception{
        try {
            System.out.println("进入方法A");
            throw new Exception("制造异常");
        } finally {
            System.out.println("用A方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        methodB();
    }
}
