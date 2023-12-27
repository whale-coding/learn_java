package com.star._interface.exer1;

/**
 * @Date 2023-12-22 22:49 星期五
 * @Author: 聂建强
 * @Description:
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];
        // 多态性
        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
