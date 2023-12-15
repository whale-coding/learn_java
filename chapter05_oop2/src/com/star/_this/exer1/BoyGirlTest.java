package com.star._this.exer1;

/**
 * @Date 2023-12-14 22:48 星期四
 * @Author: 聂建强
 * @Description:
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("杰克",24);
        Girl girl1 = new Girl("朱丽叶",20);

        girl1.marry(boy1);

        boy1.shout();

        Girl girl2 = new Girl("肉丝",18);
        int compare = girl1.compare(girl2);
        if(compare > 0){
            System.out.println(girl1.getName() + "大");
        }else if(compare < 0){
            System.out.println(girl2.getName() + "大");
        }else{
            System.out.println("一样大");
        }
    }
}
