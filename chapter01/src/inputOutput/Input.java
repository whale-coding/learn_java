package inputOutput;

/**
 * @Date 2023-11-27 22:31 星期一
 * @Author: 聂建强
 * @Description:
 */
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        // 创建scanner对象
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = input.nextInt();
        System.out.println("您输入："+n);
        // 关闭scanner对象
        input.close();
    }
}
