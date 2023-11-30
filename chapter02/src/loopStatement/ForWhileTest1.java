package loopStatement;

import java.util.Scanner;

/**
 * @Date 2023/11/30 19:43
 * @Author: 聂建强
 * @Description:  案例：从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 */
public class ForWhileTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;  // 记录正数的个数
        int negativeCount = 0;  // 记录负数的个数

        while (true){
            System.out.println("请输入一个整数(输入为0时结束程序)：");
            int num = sc.nextInt();

            if (num>0){  // 正数
                positiveCount ++;
            }else if (num<0){  // 负数
                negativeCount++;
            }else {  // 零
                System.out.println("程序结束！");
                break;
            }
        }
        System.out.println("正数的个数为：" + positiveCount);
        System.out.println("负数的个数为：" + negativeCount);

        sc.close();

    }
}
