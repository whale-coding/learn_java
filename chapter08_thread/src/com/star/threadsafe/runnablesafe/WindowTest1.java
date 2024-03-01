package com.star.threadsafe.runnablesafe;

/**
 * @Date 2024/2/29 19:53
 * @Author: 聂建强
 * @Description: 使用实现Runnable接口的方式，实现卖票
 *               使用同步方法解决线程安全问题
 */
public class WindowTest1 {
    public static void main(String[] args) {
      SaleTicket1 s = new SaleTicket1();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}


class SaleTicket1 implements Runnable{
    int ticket = 100;

    boolean isFlag = true;

    @Override
    public void run() {
        while (true){
            show();
        }

    }

    public synchronized void show(){  // 此时的同步监视器就是this,此题目中即为s，是唯一的
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
