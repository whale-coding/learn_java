package com.star.example.exer5_objarr;

/**
 * @Date 2023-12-10 18:01 星期日
 * @Author: 聂建强
 * @Description: 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 *  *            问题一：打印出3年级(state值为3）的学生信息。
 *  *            问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建Student[]
        Student[] students = new Student[20];

        // 使用循环，给数组赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            //给每一个学生对象的number、state、score属性赋值
            students[i].number = i+1;
            students[i].state = (int) (Math.random()*6+1);
            students[i].score = (int) (Math.random()*101);
        }

        //需求1：打印出3年级(state值为3）的学生信息
        for (int i = 0; i < students.length; i++) {
            if(3==students[i].state){
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }

        // 需求2：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        //排序前遍历
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }

        System.out.println("********************");
        // 进行排序
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length-1-i; j++) {
                // 错误的,不满足实际需求
                // int temp = students[j].score;
                // students[j].score = students[j + 1].score;
                // students[j + 1].score = temp;

                // 正确的
                Student temp = students[j];
                students[j] = students[j+1];
                students[j+1] = temp;
            }
        }

        //排序后遍历
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }

    }
}
