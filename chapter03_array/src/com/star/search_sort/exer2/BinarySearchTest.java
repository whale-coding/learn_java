package com.star.search_sort.exer2;

/**
 * @Date 2023-12-08 21:07 星期五
 * @Author: 聂建强
 * @Description:  二分查找 (要求此数组必须是有序的)
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int target = 5;

        int head = 0;  // 默认的首索引
        int end = arr.length - 1;  // 默认的尾索引
        boolean isFlag = false;  // 判断是否找到了指定元素

        while (head <= end){
            int middle = (head+ end)/2;

            if (target == arr[middle]){
                System.out.println("找到了" + target + ",对应的位置为：" + middle);
                isFlag = true;
                break;
            }else if (target>arr[middle]){
                head = middle + 1;
            }else {  // target < arr[middle]
                end = middle -1;
            }
        }

        if (!isFlag){
            System.out.println("不好意思，未找到");
        }
    }
}
