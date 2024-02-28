package com.star.create.exer1;

/**
 * @Date 2024/2/28 14:50
 * @Author: 聂建强
 * @Description: 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数。
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        // 方式1：
        EvenNumberPrint t1 = new EvenNumberPrint();
        OddNumberPrint t2 = new OddNumberPrint();

        t1.start();
        t2.start();


        // 方式2：创建Thread类的匿名子类的匿名对象
        new Thread(){
            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    if (i % 2==0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    if (i % 2 !=0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();



        // 方式3：使用实现Runnable接口的方式：（提供了Runnable接口匿名实现类的匿名对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    if (i % 2==0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    if (i % 2 !=0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();


    }
}

class EvenNumberPrint extends Thread{  // 用于打印偶数
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class OddNumberPrint extends Thread{  // 用于打印奇数
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            }
        }
    }
}
