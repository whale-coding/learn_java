package com.star.threadsafe.threadsafe;

/**
 * @Date 2024/2/29 17:06
 * @Author: 聂建强
 * @Description:  使用继承Thread类的方式，实现卖票，使用同步代码块的方式解决线程安全问题
 *                同步监视器谨慎使用this,可以考虑使用当前类.class
 */
public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}

class Window extends Thread{
    static int ticket = 100;
    @Override
    public void run() {
        while (true){
            synchronized (Window.class){  // this:此时表示w1,w2,w3   Class cls =Window.class 是唯一的
                if (ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket);
                    ticket --;
                }else {
                    break;
                }
            }

        }
    }
}
