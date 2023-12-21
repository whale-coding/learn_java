package com.star.field.interview;

/**
 * @Date 2023-12-20 22:55 星期三
 * @Author: 聂建强
 * @Description:
 */
public class Test02 {

    static int x, y, z;

    static {
        int x = 5;
        x--;
    }

    static {
        x--;
    }

    public static void method() {
        y = z++ + ++z;
    }
    public static void main(String[] args) {
        System.out.println("x=" + x);
        z--;
        method();
        System.out.println("result:" + (z + y + ++z));
    }
}
