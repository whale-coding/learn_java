package com.star.field.interview;

/**
 * @Date 2023-12-20 22:55 星期三
 * @Author: 聂建强
 * @Description:
 */
public class Test01 {
    public static void main(String[] args) {
        new HelloB();
    }
}


class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    }

    {
        System.out.println("I'm A Class");
    }

    static {
        System.out.println("static A");
    }
}

class HelloB extends HelloA {
    public HelloB() {
        System.out.println("HelloB");
    }

    {
        System.out.println("I'm B Class");
    }

    static {
        System.out.println("static B");
    }


}
