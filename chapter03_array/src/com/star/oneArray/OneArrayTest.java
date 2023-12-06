package com.star.oneArray;

/**
 * @Date 2023/12/1 21:31
 * @Author: 聂建强
 * @Description:  一维数组的基本使用
 */
public class OneArrayTest {
    public static void main(String[] args) {
        // 1. 数组的声明与初始化
        // 1.1 声明数组
        double[] prices;
        // 1.2数组的初始化
        prices = new double[]{20.32,12.58,66.78};

        // 合并起来写(数组的声明+初始化)
        // 方式1：静态初始化：数组变量的赋值与数组元素的赋值操作同时进行。
        String[] foods = new String[]{"拌海蜇","龙须菜","炝冬笋","玉兰片"};
        // 方式2：动态初始化：数组变量的赋值与数组元素的赋值操作分开进行。
        String[] foods2 = new String[4];

        // 其他的正确方式
        int arr[] = new int[4];  // 不常用
        int[] arr2 ={1,2,3,4};   // 常用一些,是int[] arr2 = new int[]{1,2,3,4}的简写

        // 错误的方式
        // int[] arr3 = new int[4];
        // int[3] arr4 ={1,2,3,4};

        //2. 数组元素的调用
        /*
         * 通过角标的方式，获取数组的元素.
         * 角标的范围从0开始，到数组的长度-1结束
         *
         */
        System.out.println(foods[0]);
        System.out.println(foods[3]);
        // System.out.println(foods[4]);  // 报异常：ArrayIndexOutOfBoundsException

        foods[2] = "番茄鸡蛋";
        foods[3] = "小炒牛肉";

        //3. 数组的长度：用来描述数组容器中容量的大小，使用length属性表示
        System.out.println(foods.length);  // 4
        System.out.println(prices.length);  // 3

        // 4. 如何遍历数组:for循环使用的较多,遍历的长度可以使用:数组名.length
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }

    }
}
