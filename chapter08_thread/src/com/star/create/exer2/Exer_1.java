package com.star.create.exer2;

/**
 * @Date 2024/2/28 16:06
 * @Author: 聂建强
 * @Description:
 */
public class Exer_1 {
    public static void main(String[] args) {
       BB b = new BB();
       new Thread(b){
           @Override
           public void run() {
               System.out.println("CC");
           }
       }.start();
    }
}



class AA extends Thread{
    @Override
    public void run() {
        System.out.println("AA");
    }
}

class BB implements Runnable{
    @Override
    public void run() {
        System.out.println("BB");
    }
}
