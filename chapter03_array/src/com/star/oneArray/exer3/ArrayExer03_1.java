package com.star.oneArray.exer3;

import java.util.Scanner;

/**
 * @Date 2023/12/2 17:07
 * @Author: 聂建强
 * @Description:  ArrayExer03案例：学生考试等级划分 的优化
 */
public class ArrayExer03_1 {
    public static void main(String[] args) {
        //1. 从键盘输入学生的人数，根据人数，创建数组(动态初始化)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数: ");
        int count = sc.nextInt();

        int[] scores = new int[count];
        //2. 根据提示，依次输入学生成绩，并将成绩保存在数组元素中
        int maxScore = scores[0];
        System.out.println("请输入"+count+"个成绩：");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            //3. 获取学生成绩的最大值
            if (maxScore<scores[i]){
                maxScore = scores[i];
            }
        }
        System.out.println("最高分是：" + maxScore);
        //4. 遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的等级，并输出成绩和等级
        char grade;
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= maxScore - 10) {
                grade = 'A';
            } else if (scores[i] >= maxScore - 20) {
                grade = 'B';
            } else if (scores[i] >= maxScore - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }

            System.out.println("student " + i + " score is " + scores[i] +
                    " grade is " + grade);
        }
        sc.close();
    }
}
