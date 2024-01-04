package com.star._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Date 2024/1/3 23:02
 * @Author: 聂建强
 * @Description:
 */
public class ThrowsTest {
    public static void main(String[] args) {
        method3();

        try {
            method2();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void method3(){
        try {
            method2();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void method2()throws FileNotFoundException,IOException{
        method1();
    }
    public static void method1()throws FileNotFoundException, IOException {
        File file = new File("D:.//hello.txt");

        FileInputStream fis = new FileInputStream(file);  // 可能报FileNotFoundException

        int data = fis.read();  // 可能报IOException
        while (data != -1){
            System.out.println((char) data);
            data = fis.read();  // 可能报IOException
        }

        fis.close();  // 可能报IOException
    }

}
