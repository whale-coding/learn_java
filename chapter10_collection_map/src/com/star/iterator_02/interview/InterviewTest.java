package com.star.iterator_02.interview;

/**
 * @Classname: InterviewTest
 * @Date: 2024/3/19 22:47
 * @Author: 聂建强
 * @Description: 笔试题：写出如下程序的输出结果
 */
public class InterviewTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"AA","CC","DD"};

        // 赋值操作1:修改成功，输出为："MM","MM","MM"
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "MM";
        }

        // 赋值操作2:未修改成，输出为："AA","CC","DD"
        for (String s: arr) {
            s = "MM";
        }

        // 遍历
        for (String s: arr) {
            System.out.println(s);
        }
    }
}
