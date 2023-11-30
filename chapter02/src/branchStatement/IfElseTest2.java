package branchStatement;
import java.util.Scanner;
/**
 * @Date 2023-11-28 21:42 星期二
 * @Author: 聂建强
 * @Description: 测试if-else的嵌套使用
 * 案例：
 * 由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else)，并且从小到大输出。
 * <p>
 * 拓展：你能实现从大到小顺序的排列吗？
 *<p>
 * 1. 从开发经验上讲，没有写过超过三层的嵌套if-else结构。
 * 2. 如果if-else中的执行语句块中只有一行执行语句，则此执行语句所在的一对{}可以省略。但是，不建议省略
 */
public class IfElseTest2 {
    public static void main(String[] args) {
        // 接收输入
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1>=num2){
            if (num3>=num1){
                System.out.println(num2 + " ," + num1 + " ," + num3);
            }else if (num3 <= num2){
                System.out.println(num3 + " ," + num2 + " ," + num1);
            }else {
                System.out.println(num2 + " ," + num3 + " ," + num1);
            }
        }else {  // num1< num2
            if (num3 > num2){
                System.out.println(num1 + " ," + num2 + " ," + num3);
            }else if (num3 <= num1){
                System.out.println(num3 + " ," + num1 + " ," + num2);
            }else {
                System.out.println(num1 + " ," + num3 + " ," + num2);
            }
        }
        // 关闭sc
        sc.close();
    }
}
