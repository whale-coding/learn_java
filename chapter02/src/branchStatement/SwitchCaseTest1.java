package branchStatement;

import java.util.Scanner;

/**
 * @Date 2023-11-28 23:11 星期二
 * @Author: 聂建强
 * @Description: 案例3：使用switch-case实现：对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
 */
public class SwitchCaseTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        // 方式1：体会case穿透
        switch (score/10){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩输入错误！");
        }

        // 方式2：
        switch (score/60){
            case 0:
                System.out.println("不及格");
            case 1:
                System.out.println("及格");
                break;
            default:
                System.out.println("成绩输入错误！");
        }

        // 方式3：箭头标签
        switch (score/60){
            case 0 -> System.out.println("不及格");
            case 1 -> System.out.println("及格");
            default -> System.out.println("成绩输入错误！");
        }

        sc.close();
    }
}
