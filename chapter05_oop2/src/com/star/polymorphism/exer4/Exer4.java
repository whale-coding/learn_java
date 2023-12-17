package com.star.polymorphism.exer4;

/**
 * @Date 2023-12-16 23:36 星期六
 * @Author: 聂建强
 * @Description:
 */
public class Exer4 {
    public static void main(String[] args) {
        Exer4 exer = new Exer4();
        exer.meeting(new Man(),new Woman(),new Man());
    }

    public void meeting(Person ... ps){

        for (int i = 0; i < ps.length; i++) {

            ps[i].eat();
            ps[i].toilet();

            if(ps[i] instanceof Woman){

                Woman woman = (Woman)ps[i];
                woman.makeup();

            }else if(ps[i] instanceof Man){
                Man man = (Man)ps[i];
                man.smoke();
            }

            System.out.println();
        }

    }
}
