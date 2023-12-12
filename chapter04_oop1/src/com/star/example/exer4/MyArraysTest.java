package com.star.example.exer4;

/**
 * @Date 2023-12-10 13:09 星期日
 * @Author: 聂建强
 * @Description:
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,56,223,2,56,24,56,67,778,45};
        MyArrays arrs = new MyArrays();

        //求最大值
        System.out.println("最大值为：" + arrs.getMax(arr));
        //求平均值
        System.out.println("平均值为：" + arrs.getAvg(arr));

        //遍历
        arrs.print(arr);

        //查找
        int index = arrs.linearSearch(arr,24);
        if(index >= 0){
            System.out.println("找到了，位置为：" + index);
        }else{
            System.out.println("未找到");
        }

        //排序
        arrs.sort(arr);
        //遍历
        arrs.print(arr);

    }
}
