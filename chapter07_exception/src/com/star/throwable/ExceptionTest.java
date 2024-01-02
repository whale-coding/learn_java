package com.star.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * @Date 2024/1/2 15:31
 * @Author: 聂建强
 * @Description:  演示常见的异常
 */
public class ExceptionTest {
    /**
     * ArrayIndexOutOfBoundsException
     */
    @Test
    public void test1(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    /**
     * NullPointerException
     */
    @Test
    public void test2(){
        String str = "hello";
        str = null;
        System.out.println(str.toString());

        int[] arr = new int[10];
        arr = null;
        System.out.println(arr[0]);

        int[][] arr1 = new int[10][];
        System.out.println(arr1[0][0]);
    }

    /**
     * ClassCastException
     */
    @Test
    public void test3(){
        Object obj = new String();
        Date date = (Date) obj;
    }

    /**
     * NumberFormatException
     */
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

    /**
     * InputMismatchException
     */
    @Test
    public void test5(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }

    /**
     * ArithmeticException
     */
    @Test
    public void test6(){
        int num = 10;
        System.out.println(num/0);
    }
    //******************以上是运行时异常，以下是编译时异常*****************************

    /**
     * ClassNotFoundException
     */
    @Test
    public void test7() throws ClassNotFoundException{
        Class clz = Class.forName("java.lang.String");
    }

    /**
     * FileNotFoundException 和  IOException
     */
    @Test
    public void test8() throws FileNotFoundException, IOException {
        File file = new File("D:\\hello.txt");
        FileInputStream fis = new FileInputStream(file);  // 可能报FileNotFoundException

        int data = fis.read();  // 可能报IOException
        while(data != -1){
           System.out.print((char)data);
           data = fis.read();  // 可能报IOException
       }
        fis.close();  // 可能报IOException
    }
}
