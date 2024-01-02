package com.star.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Date 2024/1/2 18:49
 * @Author: 聂建强
 * @Description:  异常处理之 try-catch
 */
public class ExceptionHandleTest {

    @Test
    public void test1(){
        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(num);
        }catch (NullPointerException e){
            System.out.println("出现了NullPointerException的异常");
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("异常处理结束，代码继续执行......");
    }


    //******************下面来处理编译时异常***************************
    @Test
    public void test2(){
        try {
            File file = new File("D:\\hello.txt");
            FileInputStream fis = new FileInputStream(file);  // 可能报FileNotFoundException

            int data = fis.read();  // 可能报IOException
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();  // 可能报IOException
            }
            fis.close();  // 可能报IOException
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("读取数据结束....");
        
    }
}
