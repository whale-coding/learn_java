package com.star.create.runnable;

/**
 * @Date 2024/2/28 15:05
 * @Author: 聂建强
 * @Description:  多线程的创建方式2：实现Runnable接口
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        // TODO：3、创建当前实现类的对象
        EvenNumberPrint p = new EvenNumberPrint();
        //  TODO:4、将此对象作为参数传递到Thread类的构造器中。创建Thread类的实例
        Thread t1 = new Thread(p);
        // TODO:5、Thread类的实例调用start()方法：1、启动线程 2、调用当前线程的run()方法
        t1.start();

        // main()方法对应的主线程执行的操作
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

        /*
         * 扩展：再创建一个线程，用于遍历100以内的偶数
         */
        Thread t2 = new Thread(p);
        t2.start();
    }
}

// TODO:1、创建一个实现Runnable接口的类
class EvenNumberPrint implements Runnable{

    // TODO:2、实现接口中的run()方法 --->将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}