package com.star.main;

/**
 * @Date 2023-12-18 23:19 星期一
 * @Author: 聂建强
 * @Description:
 */
public class MainTest {
    public static void main(String[] args) {  // 程序的入口
        String[] arr = new String[]{"AA","BB","CC"};
        Main.main(arr);
    }
}


class Main{

    public static void main(String[] args) { //看做是普通的静态方法
        System.out.println("Main的main()的调用");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

}
