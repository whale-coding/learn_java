package com.star.throwable;

/**
 * @Date 2024/1/2 16:20
 * @Author: 聂建强
 * @Description:
 */
public class ErrorTest {
    public static void main(String[] args) {

        // 举例1：栈内存溢出的错误StackOverflowError
        main(args);

        // 举例2：OutOfMemoryError: Java heap space
        byte[] arr = new byte[1024 * 1024 * 100];  // 100mb

    }
}
