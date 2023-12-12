package com.star.method_more._01overload;

/**
 * @Date 2023-12-10 22:33 星期日
 * @Author: 聂建强
 * @Description:  面试题
 */
public class InterviewTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        System.out.println(arr1);  // 地址值

        char[] arr2 = new char[]{'a','b','c'};
        // 解释：调用的是不同的println()方法
        System.out.println(arr2);  // abc

        boolean[] arr3 = new boolean[]{false,true,true};
        System.out.println(arr3);  // 地址值

    }
}
