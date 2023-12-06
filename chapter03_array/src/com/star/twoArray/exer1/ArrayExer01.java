package com.star.twoArray.exer1;


/**
 * @Date 2023-12-04 22:43 星期一
 * @Author: 聂建强
 * @Description:
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        //初始化数组：静态初始化
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};

        int sum = 0;  // 记录元素的总和
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和为：" + sum);

    }
}
