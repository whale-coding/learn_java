package com.star.example.exer5_objarr1;

/**
 * @Date 2023-12-10 18:11 星期日
 * @Author: 聂建强
 * @Description: 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 *  *            问题一：打印出3年级(state值为3）的学生信息。
 *  *            问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建Student[]
        Student[] students = new Student[20];

        //使用循环，给数组的元素赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            //给每一个学生对象的number、state、score属性赋值
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }

        // 创建工具类对象
        StudentUtil util = new StudentUtil();

        // 需求1：打印出3年级(state值为3）的学生信息
        util.printStudentsWithState(students,3);
        // 需求2：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        // 排序前遍历
        util.printStudents(students);

        System.out.println("********************");

        // 排序
        util.sortStudents(students);

        // 排序后遍历
        util.printStudents(students);

    }
}
