package com.star.threadsafe.runnablesafe;

/**
 * @Date 2024/2/29 17:01
 * @Author: 聂建强
 * @Description:  使用实现Runnable接口的方式，实现卖票,同时使用同步代码块解决上述卖票中的线程安全问题
 *                同步监视器可以考虑使用this
 */
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();

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

class SaleTicket implements Runnable{
    int ticket = 100;

    @Override
    public void run() {
        while (true){
            synchronized (this){  // this:是唯一的? yes,就是题目中的s
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
