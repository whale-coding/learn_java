package com.star._final;

/**
 * @Date 2023-12-21 21:49 星期四
 * @Author: 聂建强
 * @Description:
 */
public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.MIN_SCORE);
        // e.MIN_SCORE = 1;

        E e1 = new E(10);
        // e1.LEFT = 11;
    }
}


class E{
    // 成员变量
    final int MIN_SCORE = 0;
    final int MAX_SCORE;

    final int LEFT;

    // final int RIGHT;

    {
       // MIN_SCORE = 1;
        MAX_SCORE = 100;
    }

    public E(){
        LEFT = 2;
    }
    public E(int left){
        LEFT = left;
    }

   // public void setRight(int right){
   //     RIGHT = right;
   // }

}

class F{
    public void method(){
        final int num;
        num = 10;
        // num++;
        System.out.println(num);
    }

    public void method(final int num){
        // num++;
        System.out.println(num);
    }
}

final class A{

}

// class B extends A{}
// class SubString extends String{}

class C{
    public final void method(){

    }
}

class D extends C{
    // public void method(){}
}
