package com.star._static.exer2;

/**
 * @Date 2023-12-18 22:54 星期一
 * @Author: 聂建强
 * @Description:
 */
public class MyArraysTest {
    public static void main(String[] args) {

        int[] arr = new int[]{34,56,223,2,56,24,56,67,778,45};

        //求最大值
        System.out.println("最大值为：" + MyArrays.getMax(arr));
        //求平均值
        System.out.println("平均值为：" + MyArrays.getAvg(arr));

        //遍历
        MyArrays.print(arr);

        //查找
        int index = MyArrays.linearSearch(arr,24);
        if(index >= 0){
            System.out.println("找到了，位置为：" + index);
        }else{
            System.out.println("未找到");
        }

        //排序
        MyArrays.sort(arr);
        //遍历
        MyArrays.print(arr);
    }
}
