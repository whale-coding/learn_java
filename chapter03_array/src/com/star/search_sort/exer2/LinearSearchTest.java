package com.star.search_sort.exer2;

/**
 * @Date 2023-12-08 20:56 星期五
 * @Author: 聂建强
 * @Description:  线性查找
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int target = 5;

        // 查找方式：线性查找
        // 方式1：靠break结束循环  靠循环条件结束循环
        boolean isFlag = true;
        for (int i = 0; i <arr.length ; i++) {
            if (target == arr[i]){
                System.out.println("找到了" + target + ",对应的位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("不好意思，没有找到此元素");
        }


        // 方式2：靠循环条件结束循环
        int i = 0;
        for (;i < arr.length; i++){
            if (target == arr[i]){
                System.out.println("找到了" + target + ",对应的位置为：" + i);
                break;
            }
        }

        if (i == arr.length){
            System.out.println("不好意思，没有找到此元素");
        }

    }
}
