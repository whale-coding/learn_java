package com.star._interface.exer2;

/**
 * @Date 2023-12-22 22:53 星期五
 * @Author: 聂建强
 * @Description:
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(5.3);

        int compareValue = c1.compareTo(c2);
        if(compareValue > 0){
            System.out.println("c1对象大");
        }else if(compareValue < 0){
            System.out.println("c2对象大");
        }else{
            System.out.println("c1和c2一样大");
        }
    }
}
