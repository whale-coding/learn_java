package inputOutput;

import java.util.Scanner;

/**
 * @Date 2023-11-28 22:22 星期二
 * @Author: 聂建强
 * @Description:
 */
public class ScannerExer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高：");
        int height = sc.nextInt();
        System.out.println("请输入你的财富：");
        double wealth = sc.nextDouble();
        System.out.println("帅否？（是/否）");
        String isHandsome = sc.next();
        //判断
        if(height >= 180 && wealth >= 1.0 && isHandsome.equals("是")){  //知识点：判断两个字符串是否相等，使用String的equals()
            System.out.println("我一定要嫁给他!!!");
        }else if(height >= 180 || wealth >= 1.0 || isHandsome.equals("是")){
            System.out.println("嫁吧，比上不足，比下有余。");
        }else{
            System.out.println("不嫁");
        }
        // 关闭
        sc.close();
    }
}
