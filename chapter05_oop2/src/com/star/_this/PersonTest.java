package com.star._this;


/**
 * @Date 2023-12-14 22:26 星期四
 * @Author: 聂建强
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        System.out.println(p1.age);

        Person p2 = new Person("Tom",18,"tom@126.com");
        System.out.println("name = " + p2.name +"age=" +p2.age+ ", email = " + p2.email);
    }
}

class Person{
    String name;
    int age;
    String email;

    public Person() {

    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 其他方法
    public void eat(){
        System.out.println("人吃饭");

        this.sleep();
    }
    public void sleep(){
        System.out.println("人睡觉");
    }
}
