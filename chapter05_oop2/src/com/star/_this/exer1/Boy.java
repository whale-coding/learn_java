package com.star._this.exer1;

/**
 * @Date 2023-12-14 22:45 星期四
 * @Author: 聂建强
 * @Description:
 */
public class Boy {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boy() {

    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Girl girl){
        System.out.println("我想娶" + girl.getName());
    }

    public void shout(){
        if(this.age >= 22){
            System.out.println("我终于可以结婚了！");
        }else{
            System.out.println("我只能多谈恋爱了");
        }
    }
}
