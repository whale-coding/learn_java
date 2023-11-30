package MathRandom;

import java.awt.event.MouseAdapter;

/**
 * @Date 2023-11-28 22:17 星期二
 * @Author: 聂建强
 * @Description:  如何获取一个随机数?
 * 1. 可以使用Java提供的API:Math类的random()
 * 2. random()调用以后，会返回一个[0.0,1.0)范围的double型的随机数
 *
 * 3. 需求1：获取一个[0,100]范围的随机整数？
 *    需求2：获取一个[1,100]范围的随机整数？
 *
 * 4. 需求：获取一个[a,b]范围的随机整数？
 *    (int)(Math.random() * (b - a + 1)) + a
 */
public class RandomTest {
    public static void main(String[] args) {
        // 产生范围[0,1)的随机数
        double d1 = Math.random();
        System.out.println(d1);
        // [0,100]的整数
        int num1 = (int) (Math.random()*100);
        System.out.println(num1);
        // [1,100]的整数
        int num2 = (int) (Math.random()*+1);
        System.out.println(num2);
    }
}
