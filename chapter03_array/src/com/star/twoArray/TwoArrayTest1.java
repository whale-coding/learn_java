package com.star.twoArray;

/**
 * @Date 2023-12-04 22:28 星期一
 * @Author: 聂建强
 * @Description:  二维数组的基本使用（难点）  （承接TwoArrayTest.java）
 *
 * 外层元素都是地址值，内层元素的初始值跟一维数组的一样（跟数据类型有关）
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {
        //5. 数组元素的默认初始化值

        //以动态初始化方式1说明：
        int[][] arr1 = new int[3][2];
        //外层元素默认值：
        System.out.println(arr1[0]);  // [I@776ec8df
        //内层元素默认值：
        System.out.println(arr1[0][0]);  // 0

        boolean[][] arr2 = new boolean[3][4];
        //外层元素默认值：
        System.out.println(arr2[0]);  // [Z@3b07d329
        //内层元素默认值：
        System.out.println(arr2[0][1]);  // false

        String[][] arr3 = new String[4][2];
        //外层元素默认值：
        System.out.println(arr3[0]);  // [Ljava.lang.String;@41629346
        //内层元素默认值：
        System.out.println(arr3[0][1]);  // null

        //********************************

        //以动态初始化方式2说明：
        int[][] arr4 = new int[4][];
        //外层元素默认值：
        System.out.println(arr4[0]);  // null
        //内层元素默认值：
        System.out.println(arr4[0][0]);  // 报错 NullPointerException


        //6. 数组的内存解析

    }
}
