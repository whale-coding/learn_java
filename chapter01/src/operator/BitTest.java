package operator;

/**
 * @Date 2023-11-27 16:42 星期一
 * @Author: 聂建强
 * @Description:  测试运算符的使用5：位运算符
 *
 *
 * 1. <<   >>   >>>   &  |  ^  ~
 *
 * 2. 说明：
 *
 * ① <<   >>   >>>   &  |  ^  ~ ：针对数值类型的变量或常量进行运算，运算的结果也是数值
 * ②
 * << : 在一定范围内，每向左移动一位，结果就在原有的基础上 * 2。（对于正数、负数都适用）
 * >> : 在一定范围内，每向右移动一位，结果就在原有的基础上 / 2。（对于正数、负数都适用）
 *
 * 3. 面试题：高效的方式计算2 * 8 ？    答案：2 << 3 或 8 << 1
 */
public class BitTest {
    public static void main(String[] args) {
        int num=7;
        System.out.println("num<<1:"+(num<<1));  // 14
        System.out.println("num<<2:"+(num<<2));  // 28
        System.out.println("num<<3:"+(num<<3));  // 56
        System.out.println("num<<28:"+(num<<28));  // 1879048192
        System.out.println("num<<28:"+(num<<29));  // -536870912   过犹不急

        int num2 = -7;
        System.out.println("num2<<1:"+(num2<<1));  // -14
        System.out.println("num2<<2:"+(num2<<2));  // -28
        System.out.println("num2<<3:"+(num2<<3));  // -56

        System.out.println(~9);  //-10
        System.out.println(~-10);  //9
    }
}
