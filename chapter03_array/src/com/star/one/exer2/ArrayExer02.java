package com.star.one.exer2;

import java.util.Scanner;

/**
 * @Date 2023/12/2 16:42
 * @Author: 聂建强
 * @Description:  案例：输出英文星期几
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 *  {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        // 定义包含7个单词的数组
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        // 从键盘获取指定的数值，使用Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数值（1-7）：");
        int day = sc.nextInt();

        // 针对获取的数据进行判断即可
        if (day <1 || day > 7){
            System.out.println("输入的数据有误！");
        }else {
            System.out.println(weeks[day - 1]);
        }

    }
}
