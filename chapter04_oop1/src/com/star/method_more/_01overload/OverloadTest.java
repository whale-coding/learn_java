package com.star.method_more._01overload;

/**
 * @Date 2023-12-10 22:28 星期日
 * @Author: 聂建强
 * @Description:
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest test = new OverloadTest();

        test.add(1,2,3);

        test.add(10,20);

        test.add(10,20.0);

    }

    public void add(int i,int j){
        System.out.println();
    }
    public void add(double i,double j){
        System.out.println();
    }

    public void add(int i,int j,int k){
        System.out.println();
    }
    public void add(String s1,String s2){
        System.out.println();
    }
    public void add(int i,String s){
        System.out.println();
    }
    public void add(String s, int i){
        System.out.println();
    }

    // 下面两个都是不正确的

   //  public void add(int m ,int n){
   //     System.out.println("2222");
   // }
   //
   // public int add(int m,int n){
   //     return m + n;
   // }

}
