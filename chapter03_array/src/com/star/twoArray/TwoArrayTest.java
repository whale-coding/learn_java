package com.star.twoArray;


/**
 * @Date 2023-12-04 21:37 星期一
 * @Author: 聂建强
 * @Description:  二维数组的基本使用（难点）
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        // 1.一维数组的声明与初始化
        // 静态初始化 方式1
        int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
        // 静态初始化 方式2
        int[][] arr1 = {{1,1,3},{4,5},{7,8}};  // 类型推断
        // 动态初始化 方式1
        String[][] arr2 = new String[3][4];
        // 动态初始化 方式2
        double[][] arr3 = new double[3][];

        //2. 数组元素的调用
        //针对于arr来说，外层元素{1,2,3}、{4,5}、{6,7,8,9} 内层元素：1,2,3,4,5,6,7,8,9
        //调用内层元素
        System.out.println(arr[0][0]);  // 1
        System.out.println(arr[2][1]);  // 5
        //调用外层元素
        System.out.println(arr[0]);  // [I@7ba4f24f  地址值

        //测试arr2,arr3
        arr2[0][1] = "Tom";
        System.out.println(arr2[0][1]);  // Tom
        System.out.println(arr2[0]);  // [Ljava.lang.String;@3b07d329

        arr3[0]= new double[4];
        arr3[0][0] = 1.0;

        //3. 数组的长度
        System.out.println(arr.length);  // 3
        System.out.println(arr[0].length);  // 3
        System.out.println(arr[1].length);  // 2
        System.out.println(arr[2].length);  // 4

        //4. 如何遍历数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }


    }
}
