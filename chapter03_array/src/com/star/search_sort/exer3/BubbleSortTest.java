package com.star.search_sort.exer3;

import javax.net.ssl.SSLEngine;
import java.util.Calendar;

/**
 * @Date 2023-12-08 21:33 星期五
 * @Author: 聂建强
 * @Description:  冒泡排序
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        // 冒泡排序，实现数组元素从小到大排列
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    // 交换arr[i]和arr[i+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
