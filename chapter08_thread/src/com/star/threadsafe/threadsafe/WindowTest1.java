package com.star.threadsafe.threadsafe;

/**
 * @Date 2024/2/29 20:00
 * @Author: 聂建强
 * @Description:   使用继承Thread类的方式，实现卖票，
 *                  使用同步方法的方式解决线程安全问题
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w1 = new Window1();
        Window1 w2 = new Window1();
        Window1 w3 = new Window1();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window1 extends Thread{
    static int ticket = 100;
    static boolean isFlag = true;
    @Override
    public void run() {
        while (true){
            show();
        }
    }

    public synchronized void show(){  // 此时同步监视器：this,此题目中this:w1,w2,w3,仍然是线程不安全的  可以选择给类加static或者在方法内使用同步代码块
        if (ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket);
            ticket --;
        }else {
            isFlag = false;
        }
    }
}

