package com.star.example.exer5_objarr1;

/**
 * @Date 2023-12-10 18:10 星期日
 * @Author: 聂建强
 * @Description:  封装的Student工具类
 */
public class StudentUtil {
    /**
     * 打印出指定年级的学生信息
     * @param students 要打印的学生数组
     * @param state 学生年级
     */
    public void printStudentsWithState(Student[] students,int state){
        for (int i = 0; i < students.length; i++) {
            if(state == students[i].state){
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }

    /**
     * 遍历指定的学生数组
     * @param students  要遍历的学生数组
     */
    public void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }

    /**
     * 针对于学生数组，按照score属性从低到高排列
     * @param students  要排序的学生数组
     */
    public void sortStudents(Student[] students){
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if(students[j].score > students[j + 1].score){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
