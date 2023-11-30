package branchStatement;

import java.util.Scanner;

/**
 * @Date 2023-11-28 23:22 星期二
 * @Author: 聂建强
 * @Description:  案例：编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
 */
public class SwitchCaseTest2 {
    public static void main(String[] args) {
        //1.使用Scanner，从键盘获取2023年的month、day
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2023年的月份：");
        int month = sc.nextInt();//阻塞式方法
        System.out.println("请输入2023年的天：");
        int day = sc.nextInt();

        //假设用户输入的数据是合法的。后期我们在开发中，使用正则表达式进行校验。

        //2. 使用switch-case实现分支结构
        int sumDays = 0;//记录总天数
        switch (month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28; //28:2月份的总天数
            case 2:
                sumDays += 31; //31:1月份的总天数
            case 1:
                sumDays += day;
                //break;
        }

        System.out.println("2023年" + month + "月" + day + "日是当前的第" + sumDays + "天");

        sc.close();//为了防止内存泄漏
    }
}
