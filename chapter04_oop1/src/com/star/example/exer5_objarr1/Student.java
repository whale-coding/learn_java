package com.star.example.exer5_objarr1;

/**
 * @Date 2023-12-10 18:10 星期日
 * @Author: 聂建强
 * @Description:  定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 */
public class Student {
    //属性
    int number;//学号
    int state;//年级
    int score;//成绩

    //声明一个方法，显示学生的属性信息
    public String show(){
        return "number : " + number + ",state : " +
                state + ", score : " + score;
    }
}
